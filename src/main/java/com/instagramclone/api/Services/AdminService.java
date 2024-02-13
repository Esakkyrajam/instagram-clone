package com.instagramclone.api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagramclone.api.Repositories.AdminRepository;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepo;
    @Autowired
    private UserService userService;

    public String toggleBlueTick(Long id, boolean blueTick) {
        return userService.toggleBlueTick(id,blueTick);
    }
}
