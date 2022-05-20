package com.genspark.CharacterStats.Entity;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Table(name = "Tbl_Character")
public class Unit {

    @Id
    @Column(name = "c_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String title;
    private int level, strength, health, defence;

    Unit(){}

    Unit(String name, String title, int lvl,
         int strength, int health, int defence){
        this.name = name;
        this.title = title;
        this.level = lvl;
        this.strength = strength;
        this.health = health;
        this.defence = defence;
    }


    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public int getLevel() {return level;}
    public void setLevel(int level) {this.level = level;}

    public int getStrength() {return strength;}
    public void setStrength(int strength) {this.strength = strength;}

    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}

    public int getDefence() {return defence;}
    public void setDefence(int defence) {this.defence = defence;}
}
