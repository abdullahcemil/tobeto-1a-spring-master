package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Table(name = "transaction")
@Entity
@Getter
@Setter


public class Transaction
{
    @Id
    @Column(name = "transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;

    @Column(name="transaction_name")
    private String transaction_name;

    @Column(name="rental_id")
    private int rental_id;

    @Column(name="car_id")
    private int car_id;

    @Column(name="cust_id")
    private int cust_id;

    @Column(name="admin_id")
    private int admin_id;

    @Column(name="transaction_date")
    private Date transaction_date;


}

