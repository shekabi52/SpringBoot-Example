package com.example.springbootdemo.Dao;

import com.example.springbootdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentInter extends JpaRepository<Student,Integer> {

    List<Student> findAllById(int id);
}
