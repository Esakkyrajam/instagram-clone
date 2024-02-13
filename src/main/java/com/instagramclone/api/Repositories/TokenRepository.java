package com.instagramclone.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagramclone.api.model.AuthenticationToken;
import com.instagramclone.api.model.User;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Long> {
    AuthenticationToken findByUser(User user);

    AuthenticationToken findFirstByToken(String token);
}
