package com.genspark.CharacterStats.Dao;

import com.genspark.CharacterStats.Entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDao extends JpaRepository<Unit, Integer> {
    @Query(value = "Select * from characterstatus.tbl_character where name = ?1", nativeQuery = true)
    Unit getByName(String Name);

    @Query(value = "Select c_Id from characterstatus.tbl_character where name = ?1", nativeQuery = true)
    int getIdByName(String Name);
}
