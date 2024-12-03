package com.crud.student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crud.student.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

    @Query("SELECT s.firstname, s.lastname, g.name " +
           "FROM Student s " +
           "JOIN s.gender g " +
           "WHERE g.name = :genderName")
    List<Object[]> findByGenderName(@Param("genderName") String genderName);
    
}
