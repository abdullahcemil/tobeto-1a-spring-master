package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Table(name = "reports")
@Entity
@Getter
@Setter


public class Reports
{
    @Id
    @Column(name = "report_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int report_id;

    @Column(name="transaction_id")
    private int transaction_id;

    @Column(name="rental_id")
    private int rental_id;

    @Column(name="report_date")
    private Date report_date;

    @ManyToOne()
    @JoinColumn(name="rental_id")
    private Rentals rentals;
    @JoinColumn(name="transaction_id")
    private Transaction transaction;


}
