package com.instagramclone.api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagramclone.api.Repositories.CommentRepository;
import com.instagramclone.api.model.Comments;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepo;

    public String addComment(Comments comments) {
        Comments rComment = commentRepo.save(comments);
        return "Comment saved...!";
    }

	
    
    
    
}
