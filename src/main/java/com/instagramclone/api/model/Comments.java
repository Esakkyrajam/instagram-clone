package com.instagramclone.api.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private String commentBody;

    @ManyToOne
    @JoinColumn(nullable = false , name = "fk_post_ID")
    private Post post;

    @ManyToOne
    @JoinColumn(nullable = false , name = "fk_user_ID")
    private User user;

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public String getCommentBody() {
		return commentBody;
	}

	public void setCommentBody(String commentBody) {
		this.commentBody = commentBody;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
    
    
    
}
