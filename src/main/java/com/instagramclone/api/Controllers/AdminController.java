package com.instagramclone.api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instagramclone.api.Services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PutMapping("user/{id}/{blueTick}")
    String toggleBlueTick(@PathVariable Long id, @PathVariable boolean blueTick) {
        return adminService.toggleBlueTick(id,blueTick);
    }
}
