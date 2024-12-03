package com.crud.student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.student.Entity.Student;
import com.crud.student.Repository.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public void deleteById(int id){
        studentRepository.deleteById(id);
    }

    // public List<Student> findByGenderName(String genderName){
    //     return studentRepository.findByGenderName(genderName);
    // }
}
