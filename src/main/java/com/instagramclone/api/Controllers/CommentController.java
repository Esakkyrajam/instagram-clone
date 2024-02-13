package com.instagramclone.api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instagramclone.api.Services.CommentService;
import com.instagramclone.api.model.Comments;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    String addComment(@RequestBody Comments comments) {
        return commentService.addComment(comments);
    }
}
