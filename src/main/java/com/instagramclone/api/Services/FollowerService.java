package com.instagramclone.api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagramclone.api.Repositories.FollowerRepository;
import com.instagramclone.api.model.Follower;
import com.instagramclone.api.model.User;

@Service
public class FollowerService {
    @Autowired
    private FollowerRepository followerRepo;

    public void saveFollower(User otherUser, User myUser) {
        Follower follower = new Follower(null,myUser,otherUser);
        followerRepo.save(follower);
    }
}
