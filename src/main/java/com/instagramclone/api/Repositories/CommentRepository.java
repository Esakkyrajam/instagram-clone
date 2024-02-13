package com.instagramclone.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagramclone.api.model.Comments;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Long> {
}
