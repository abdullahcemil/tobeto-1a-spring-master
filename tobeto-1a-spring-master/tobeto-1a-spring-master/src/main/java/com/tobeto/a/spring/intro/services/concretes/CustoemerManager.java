package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Customer;
import com.tobeto.a.spring.intro.repositories.CustomerRepository;
import com.tobeto.a.spring.intro.services.abstracts.CarService;
import com.tobeto.a.spring.intro.services.dtos.car.requests.AddCarRequest;
import org.springframework.stereotype.Service;

@Service
public class CustoemerManager implements CarService {

    private CustomerRepository customerRepository;

    public CustoemerManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void add(AddCarRequest request) {

        Customer customer = new Customer();
        customer.setFirst_name(request.getName());
        customerRepository.save(customer);


    }
}
