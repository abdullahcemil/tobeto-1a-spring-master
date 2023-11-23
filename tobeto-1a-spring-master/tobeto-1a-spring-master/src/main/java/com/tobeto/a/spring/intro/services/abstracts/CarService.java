package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.car.requests.AddCarRequest;

public interface CarService {

    void add(AddCarRequest request);
}
