package com.example.springbootdemo.service;

import com.example.springbootdemo.Dao.StudentInter;
import com.example.springbootdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentServiceInter{
    @Autowired
    private StudentInter studentInter;
    @Override
    public Student add(Student student) {
        return studentInter.save(student);
    }
}
