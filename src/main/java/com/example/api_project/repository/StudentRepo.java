package com.example.api_project.repository;

import com.example.api_project.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    // for the custom name method
    Optional<Student> findByName(String name);


    // for custom name method
    Optional<Student> findByUsername(String username);


}
