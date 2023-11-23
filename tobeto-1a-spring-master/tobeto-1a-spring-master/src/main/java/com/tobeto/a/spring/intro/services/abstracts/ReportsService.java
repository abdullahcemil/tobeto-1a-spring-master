package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.reports.requests.AddReportsRequest;

public interface ReportsService {
    void add(AddReportsRequest request);
}
