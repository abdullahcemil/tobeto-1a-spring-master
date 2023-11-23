package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Reports;
import com.tobeto.a.spring.intro.repositories.ReportsRepository;
import com.tobeto.a.spring.intro.services.abstracts.ReportsService;
import com.tobeto.a.spring.intro.services.dtos.reports.requests.AddReportsRequest;
import org.springframework.stereotype.Service;

@Service

public class ReportsManager implements ReportsService {

    private ReportsRepository reportsRepository;

    public ReportsManager(ReportsRepository reportsRepository) {
        this.reportsRepository = reportsRepository;
    }

    @Override
    public void add(AddReportsRequest request) {

        Reports reports = new Reports();
        reports.setReport_date(reports.getReport_date());
        reportsRepository.save(reports);


    }
}
