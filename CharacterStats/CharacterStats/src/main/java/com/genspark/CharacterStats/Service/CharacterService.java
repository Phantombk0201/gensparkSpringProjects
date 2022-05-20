package com.genspark.CharacterStats.Service;

import com.genspark.CharacterStats.Entity.Unit;

import java.util.List;

public interface CharacterService {

    List<Unit> getAllCharacter();
    Unit getCharacterByName(String cName);
    Unit addCharacter(Unit unit);
    Unit updateCharacter(Unit unit);
    String deleteCharacter(String cName);

}
