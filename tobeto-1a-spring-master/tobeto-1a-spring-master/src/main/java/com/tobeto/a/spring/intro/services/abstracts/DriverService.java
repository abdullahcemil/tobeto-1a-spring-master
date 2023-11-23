package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.driver.requests.AddDriverRequest;

public interface DriverService {
    void add(AddDriverRequest request);
}
