package com.instagramclone.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagramclone.api.model.Following;

@Repository
public interface FollowingRepository extends JpaRepository<Following, Long> {
}
