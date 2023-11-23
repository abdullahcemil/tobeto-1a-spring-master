package com.tobeto.a.spring.intro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "driver")
@Entity
@Getter
@Setter

public class Driver
{
    @Id
    @Column(name = "driver_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driver_id;

    @Column(name="driver_name")
    private String driver_name;

    @Column(name="commission")
    private String commission;

    @OneToMany(mappedBy = "driver_id")
    @JsonIgnore
    private List<Car> cars;
}


