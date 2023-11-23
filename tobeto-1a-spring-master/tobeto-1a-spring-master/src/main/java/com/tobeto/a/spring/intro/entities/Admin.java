package com.tobeto.a.spring.intro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "admin")
@Entity
@Getter
@Setter

public class Admin
{
    @Id
    @Column(name = "admin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int admin_id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="gender")
    private String gender;

    @Column(name="age")
    private int age;

    @Column(name="contact_add")
    private String contact_add;

    @Column(name="admin_email")
    private String admin_email;

    @Column(name="admin_pass")
    private String admin_pass;

    @OneToMany(mappedBy = "admin_id")
    @JsonIgnore
    private List<Reports> reports;


}
