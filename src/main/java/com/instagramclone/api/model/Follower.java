package com.instagramclone.api.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long followerTableId;

    @OneToOne
    private User user;

    @OneToOne
    private User follower;

	public Long getFollowerTableId() {
		return followerTableId;
	}

	public void setFollowerTableId(Long followerTableId) {
		this.followerTableId = followerTableId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getFollower() {
		return follower;
	}

	public void setFollower(User follower) {
		this.follower = follower;
	}

	public Follower(Long followerTableId, User user, User follower) {
		super();
		this.followerTableId = followerTableId;
		this.user = user;
		this.follower = follower;
	}
    
    
    
    
}
