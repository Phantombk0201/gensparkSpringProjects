package com.genspark.CharacterStats.Controller;

import com.genspark.CharacterStats.Entity.Unit;
import com.genspark.CharacterStats.Service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CharacterService characterService;

    @RequestMapping("Status")
    public String Status(@RequestParam(value = "name", defaultValue = "Select A Character") String name){
        return name;
    }
    @GetMapping("/Status")
    public List<Unit> getCharacters(){return this.characterService.getAllCharacter();}

    @GetMapping("/Status/{character}")
    public Unit getCharacter(@PathVariable String character){
        return this.characterService.getCharacterByName(character);
    }

    @PostMapping("/Status")
    public Unit addCharacter(@RequestBody Unit unit){return this.characterService.addCharacter(unit);}

    @PutMapping("/Status")
    public Unit updateCharacter(@RequestBody Unit unit){return this.characterService.addCharacter(unit);}

    @DeleteMapping("/Status/{character}")
    public String deleteCharacter(@PathVariable String character){
        return this.characterService.deleteCharacter(character);
    }
}
