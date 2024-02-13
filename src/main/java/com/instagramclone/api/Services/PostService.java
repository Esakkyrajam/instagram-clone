package com.instagramclone.api.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagramclone.api.Repositories.PostRepository;
import com.instagramclone.api.Repositories.TokenRepository;
import com.instagramclone.api.model.Post;
import com.instagramclone.api.model.User;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepo;
    @Autowired
    private TokenRepository tokenRepo;

    public void addPost(Post post) {
        postRepo.save(post);
    }

    public List<Post> getAllPosts(String token) {
        User user = tokenRepo.findFirstByToken(token).getUser();
        return postRepo.findByUser(user);
    }
}
