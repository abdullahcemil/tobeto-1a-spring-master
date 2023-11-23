package com.tobeto.a.spring.intro.services.concretes;

import com.tobeto.a.spring.intro.entities.Admin;
import com.tobeto.a.spring.intro.repositories.AdminRepository;
import com.tobeto.a.spring.intro.services.abstracts.AdminService;
import com.tobeto.a.spring.intro.services.dtos.admin.requests.AddAdminRequest;
import org.springframework.stereotype.Service;

@Service
public class AdminManager implements AdminService {

    private AdminRepository adminRepository;

    public AdminManager(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public void add(AddAdminRequest request) {
        Admin admin = new Admin();
        admin.setFirst_name(request.getName());
        adminRepository.save(admin);



    }
}
