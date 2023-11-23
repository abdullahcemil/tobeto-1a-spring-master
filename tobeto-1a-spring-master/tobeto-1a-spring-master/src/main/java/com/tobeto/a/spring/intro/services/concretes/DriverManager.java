package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Driver;
import com.tobeto.a.spring.intro.repositories.DriverRepository;
import com.tobeto.a.spring.intro.services.abstracts.DriverService;
import com.tobeto.a.spring.intro.services.dtos.driver.requests.AddDriverRequest;
import org.springframework.stereotype.Service;

@Service
public class DriverManager implements DriverService {

    private DriverRepository driverRepository;

    public DriverManager(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public void add(AddDriverRequest request) {

        Driver driver = new Driver();
        driver.setDriver_name(request.getName());
        driverRepository.save(driver);


    }
}
