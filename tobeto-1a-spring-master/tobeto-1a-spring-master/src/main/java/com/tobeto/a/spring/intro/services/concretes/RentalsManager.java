package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Rentals;
import com.tobeto.a.spring.intro.repositories.RentalsRepository;
import com.tobeto.a.spring.intro.services.abstracts.RentalsService;
import com.tobeto.a.spring.intro.services.dtos.rentals.requests.AddRentalsRequest;
import org.springframework.stereotype.Service;

@Service
public class RentalsManager implements RentalsService {

    private RentalsRepository rentalsRepository;

    public RentalsManager(RentalsRepository rentalsRepository) {
        this.rentalsRepository = rentalsRepository;
    }

    @Override
    public void add(AddRentalsRequest request) {

        Rentals rentals = new Rentals();
        rentals.setRental_num(rentals.getRental_id());
        rentalsRepository.save(rentals);


    }
}
