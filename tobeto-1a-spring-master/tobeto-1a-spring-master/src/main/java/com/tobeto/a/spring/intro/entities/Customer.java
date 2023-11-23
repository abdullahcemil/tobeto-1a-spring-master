package com.tobeto.a.spring.intro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "customer")
@Entity
@Getter
@Setter
public class Customer
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

    @Column(name="cust_email")
    private String cust_email;

    @Column(name="cust_pass")
    private String cust_pass;

    @OneToMany(mappedBy = "admin_id")
    @JsonIgnore
    private List<Transaction> transactions;

}
