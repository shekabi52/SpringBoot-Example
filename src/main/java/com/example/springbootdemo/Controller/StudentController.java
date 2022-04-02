package com.example.springbootdemo.Controller;

import com.example.springbootdemo.Dao.StudentInter;
import com.example.springbootdemo.entity.Student;
import com.example.springbootdemo.service.StudentServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceInter studentServiceInter;
    @Autowired
    private StudentInter studentInter;
    @RequestMapping("/save")
    public Student save(@RequestBody Student student)
    {
        return studentServiceInter.add(student);
    }
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable int id)
    {
        studentInter.deleteById(id);
    }
    @RequestMapping(value = "/display/{id}")
    public Optional<Student> display(@PathVariable int id)
    {
        return studentInter.findById(id);
    }
    @RequestMapping("/all")
    public List<Student> displayAll()
    {
        List<Student> students=studentInter.findAll();
        return students;
    }
    @RequestMapping("/update/{id}")
    public void update(@PathVariable int id,@RequestParam("name") String name)
    {
        System.out.println(name);
        Student s=studentInter.getById(id);
        s.setStudentName(name);
        studentInter.save(s);
    }

}
