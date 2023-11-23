package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Car;
import com.tobeto.a.spring.intro.repositories.CarRepository;
import com.tobeto.a.spring.intro.services.abstracts.CarService;
import com.tobeto.a.spring.intro.services.dtos.car.requests.AddCarRequest;
import org.springframework.stereotype.Service;

@Service
public class CarManager implements CarService {

    private CarRepository carRepository;

    public CarManager(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void add(AddCarRequest request) {

        Car car = new Car();
        car.setModelName(request.getName());
        carRepository.save(car);

    }
}
