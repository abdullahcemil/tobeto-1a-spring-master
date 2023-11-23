package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Reports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportsRepository extends JpaRepository<Reports,Integer> {
}
