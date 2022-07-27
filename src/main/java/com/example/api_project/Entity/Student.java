package com.example.api_project.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity


public class Student {

    @GeneratedValue
    @Id
    private int id;

    @Column(name = "")
    private String name;

    @Column(name = "")
    private String username;

    @Column(name = "")
    private String pwd;




}
