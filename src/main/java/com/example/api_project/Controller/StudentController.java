package com.example.api_project.Controller;

import com.example.api_project.Entity.Student;
import com.example.api_project.Hashing.SecurityConfig;
import com.example.api_project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    UserService userService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;



    // add a student
    @PostMapping("api/v1/addStudent")
    public Student addStudent(@RequestBody Student student){
        String pwd = student.getPwd();
        bCryptPasswordEncoder.encode(pwd);
        student.setPwd(pwd);
        return userService.saveStudent(student);
    }


    // add list of students
    @PostMapping("api/v1/addStudents")
    public List<Student> addStudents(@RequestBody  List<Student> students){
        return userService.saveStudents(students);
    }



    // get list of students
    @GetMapping("api/v1/getStudents")
    public List<Student> getStudents(){
        return userService.getStudent();
    }


    // get student by id
    @GetMapping("api/v1/getStudentById/{id}")
    public Student getStudentById(@PathVariable int id){
        return userService.getStudentById(id);
    }



    // delete user by id
    @DeleteMapping("api/v1/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id){
        return userService.deleteById(id);
    }



    // get students by name
    @GetMapping("api/v1/getStuByName/{name}")
    public Student getStudentByName(@PathVariable String name){
        return userService.getStudentByName(name);
    }



    // get students by username
    @GetMapping("api/v1/getByUserName/{username}")
    public Student getByUserName(@PathVariable String username){
        return userService.getByUserName(username);
    }





    // edit the users
    @PutMapping("api/v1/editUsers")
    public Student editStudents(@RequestBody Student student){
        return userService.editUser(student);
    }







}
