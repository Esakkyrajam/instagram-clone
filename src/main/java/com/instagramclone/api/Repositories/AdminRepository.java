package com.instagramclone.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagramclone.api.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
