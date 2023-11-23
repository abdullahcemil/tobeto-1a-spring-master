package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Table(name = "rentals")
@Entity
@Getter
@Setter

public class Rentals
{
    @Id
    @Column(name = "rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rental_id;

    @Column(name="rental_num")
    private int rental_num;

    @Column(name="date_rent")
    private Date date_rent;

    @Column(name="time_depart")
    private Date time_depart;

    @Column(name="time_arrive")
    private Date time_arrive;

    @Column(name="destination")
    private String destination;

    @Column(name="date_return")
    private Date date_return;

    @Column(name="payment")
    private int payment;

    @ManyToOne()
    @JoinColumn(name="reports_id")
    private Reports reports;
    @JoinColumn(name="transaction_id")
    private Transaction transaction_id;





}
