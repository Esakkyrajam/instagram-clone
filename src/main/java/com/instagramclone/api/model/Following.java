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
public class Following {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long followingTableId;

    @OneToOne
    private User user;

    @OneToOne
    private User following;

	public Long getFollowingTableId() {
		return followingTableId;
	}

	public void setFollowingTableId(Long followingTableId) {
		this.followingTableId = followingTableId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getFollowing() {
		return following;
	}

	public void setFollowing(User following) {
		this.following = following;
	}

	public Following(Long followingTableId, User user, User following) {
		super();
		this.followingTableId = followingTableId;
		this.user = user;
		this.following = following;
	}
    
    
    
    
    
    
}
