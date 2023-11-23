package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.rentals.requests.AddRentalsRequest;

public interface RentalsService {
    void add(AddRentalsRequest request);
}
