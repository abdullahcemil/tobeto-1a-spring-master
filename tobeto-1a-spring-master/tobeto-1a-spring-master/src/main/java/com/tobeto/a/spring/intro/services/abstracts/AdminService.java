package com.tobeto.a.spring.intro.services.abstracts;

import com.tobeto.a.spring.intro.services.dtos.admin.requests.AddAdminRequest;

public interface AdminService {

    void add(AddAdminRequest request);
}
