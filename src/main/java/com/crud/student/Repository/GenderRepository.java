package com.crud.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.student.Entity.Gender;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Integer>{

    
}