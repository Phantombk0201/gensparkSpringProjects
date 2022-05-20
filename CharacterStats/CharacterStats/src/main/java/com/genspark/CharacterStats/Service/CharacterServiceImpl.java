package com.genspark.CharacterStats.Service;

import com.genspark.CharacterStats.Dao.CharacterDao;
import com.genspark.CharacterStats.Entity.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class CharacterServiceImpl implements CharacterService{

    @Autowired
    private CharacterDao characterDao;

    @Override
    public List<Unit> getAllCharacter() {
        return this.characterDao.findAll();
    }


    @Override
    public Unit getCharacterByName(String cName) {
        int id = this.characterDao.getIdByName(cName);
        if(id > 0){
            Optional <Unit> c = this.characterDao.findById(id);
            Unit unit = null;
            if(c.isPresent()){
                unit = c.get();
            }
            return unit;
        }else{
            throw new RuntimeException("Character: "+cName+" not found");
        }
    }

    @Override
    public Unit addCharacter(Unit unit) {
        return this.characterDao.save(unit);
    }

    @Override
    public Unit updateCharacter(Unit unit) {
        return this.characterDao.save(unit);
    }

    @Override
    public String deleteCharacter(String cName) {
        this.characterDao.deleteById(this.characterDao.getIdByName(cName));
        return "Character was Deleted";
    }


}
