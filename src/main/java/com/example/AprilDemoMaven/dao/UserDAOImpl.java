package com.example.AprilDemoMaven.dao;

import org.springframework.stereotype.Repository;

import com.example.AprilDemoMaven.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Override
	public void save(User user) {

		System.out.println("In impl");
	}

}
