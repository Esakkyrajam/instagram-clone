package com.instagramclone.api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagramclone.api.Repositories.FollowingRepository;
import com.instagramclone.api.model.Following;
import com.instagramclone.api.model.User;

@Service
public class FollowingService {
    @Autowired
    private FollowingRepository followingRepo;

    public void saveFollowing(User myUser, User otherUser) {
        Following followingRecord =new Following(null, myUser, otherUser);
        followingRepo.save(followingRecord);
    }
}
