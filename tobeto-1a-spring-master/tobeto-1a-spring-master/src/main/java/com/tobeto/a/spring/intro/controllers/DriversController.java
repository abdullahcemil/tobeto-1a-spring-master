package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.services.abstracts.DriverService;
import com.tobeto.a.spring.intro.services.dtos.driver.requests.AddDriverRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/drivers")
public class DriversController {

    private DriverService driverService;

    public DriversController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping

    public void add(@RequestBody AddDriverRequest request){
        driverService.add(request);

    };

}
