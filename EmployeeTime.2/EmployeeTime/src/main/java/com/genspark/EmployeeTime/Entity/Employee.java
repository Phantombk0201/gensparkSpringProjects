package com.genspark.EmployeeTime.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_employee")
public class Employee {

    @Id
    @Column(name = "c_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name, title;
    private int time, rate;

    Employee(){}

    Employee(String name, String title, int time , int rate){
        this.name = name;
        this.title = title;
        this.time = time;
        this.rate = rate;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public int getTime(){ return time;}
    public void setTime(int time) {this.time = time;}

    public int getRate() {return rate;}
    public void setRate(int rate) {this.rate = rate;}
}
