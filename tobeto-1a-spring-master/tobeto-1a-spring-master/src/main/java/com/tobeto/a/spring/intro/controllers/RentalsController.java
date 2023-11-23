package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.services.abstracts.RentalsService;
import com.tobeto.a.spring.intro.services.dtos.rentals.requests.AddRentalsRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/rentals")

public class RentalsController {

    private RentalsService rentalsService;

    public RentalsController(RentalsService rentalsService) {
        this.rentalsService = rentalsService;
    }

    @PostMapping
    public void add(@RequestBody AddRentalsRequest request)
    {rentalsService.add(request);}
}
