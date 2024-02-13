package com.instagramclone.api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagramclone.api.Repositories.TokenRepository;
import com.instagramclone.api.model.AuthenticationToken;
import com.instagramclone.api.model.User;

@Service
public class AuthenticationService {
    @Autowired
    private TokenRepository tokenRepo;

    public void saveToken(AuthenticationToken token) {
        tokenRepo.save(token);
    }

    public AuthenticationToken getToken(User user) {
        return tokenRepo.findByUser(user);
    }

    public boolean authenticate(String email, String token){
        if(token==null && email==null){
            return false;
        }
        AuthenticationToken authToken = tokenRepo.findFirstByToken(token);
        if(authToken==null){
            return false;
        }
        String expectedEmail = authToken.getUser().getEmail();
        return expectedEmail.equals(email);
    }


    public void deleteToken(String token) {
        AuthenticationToken token1 = tokenRepo.findFirstByToken(token);
        tokenRepo.deleteById(token1.getTokenId());
    }

    public User findUserByToken(String token) {
        return tokenRepo.findFirstByToken(token).getUser();
    }
}
