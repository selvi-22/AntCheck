package com.example.AprilDemoMaven.dao;

import org.springframework.stereotype.Repository;

import com.example.AprilDemoMaven.model.User;

@Repository
public interface UserDAO {
	public void save(User user);
}
