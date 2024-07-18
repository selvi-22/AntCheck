package com.example.AprilDemoMaven.dao;

import org.springframework.stereotype.Repository;

import com.example.AprilDemoMaven.model.Movie;

@Repository
public class MovieDAOImpl implements MovieDAO {

	@Override
	public void saveMovie(Movie movie) {
		System.out.println("To save Movie");
	}

}
