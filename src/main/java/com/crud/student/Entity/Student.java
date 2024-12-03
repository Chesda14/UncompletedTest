package com.crud.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private int id;
    
    private String firstname;
    private String lastname;
    private int gender_id;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return firstname;
    }
    public void setFirstName(String firstname){
        this.firstname = firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
    }
    public int getGenderId(){
        return gender_id;
    }
    public void setGenederId(int gender_id){
        this.gender_id = gender_id;
    }
    
}
