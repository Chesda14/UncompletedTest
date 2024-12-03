package com.crud.student.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_gender")
public class Gender {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private int gender_id;
    private String gender_name;

    public int getGenderId(){
        return gender_id;
    }
    public void setGenderId(int gender_id){
        this.gender_id = gender_id;
    }

    public String getGenderName(){
        return gender_name;
    }
    public void setGenderName(String gender_name){
        this.gender_name = gender_name;
    }


}
