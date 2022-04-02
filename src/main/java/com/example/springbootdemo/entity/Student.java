package com.example.springbootdemo.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Student {
    @Id
    @Column(name="student_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="stduent_name",nullable = false,length=30)

    private String studentName;
    @Column(name="dept_name",nullable = false,length = 3)
    private String deptName;
}
