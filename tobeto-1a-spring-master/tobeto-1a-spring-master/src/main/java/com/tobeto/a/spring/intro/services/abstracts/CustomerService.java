package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.customer.requests.AddCustomerRequest;

public interface CustomerService {
    void add(AddCustomerRequest request);
}
