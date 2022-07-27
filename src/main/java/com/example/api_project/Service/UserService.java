package com.example.api_project.Service;

import com.example.api_project.Entity.Student;
import com.example.api_project.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class UserService {

    @Autowired
    StudentRepo studentRepo;


    // save one user
    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }


    // list of users
    public List<Student> saveStudents(List<Student> student){
        return studentRepo.saveAll(student);
    }



    // get list of users
    public List<Student> getStudent(){
        return studentRepo.findAll();
    }



    // get users by id
    public Student getStudentById(int id){
        return studentRepo.findById(id).orElse(null);
    }



    // user delete
    public String deleteById(int id){
        studentRepo.deleteById(id);
        return "Student removed: "+ id;
    }



    //edit user
    public Student editUser(Student student){
        Student students = studentRepo.findById(student.getId()).orElse(null);


//        Student students = studentRepo.findById(id).orElse(null);


        students.setName(student.getName());
        students.setUsername(student.getUsername());
        students.setPwd(student.getPwd());

        return studentRepo.save(students);

    }




    // get user by name
    public Student getStudentByName(String name){
        return studentRepo.findByName(name).orElse(null);
    }




    // get users by username
    public Student getByUserName(String username){
        return studentRepo.findByUsername(username).orElse(null);
    }




}
