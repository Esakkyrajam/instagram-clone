package com.instagramclone.api.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagramclone.api.model.Post;
import com.instagramclone.api.model.User;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUser(User user);
}
