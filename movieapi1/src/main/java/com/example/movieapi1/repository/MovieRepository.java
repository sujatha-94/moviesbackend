package com.example.movieapi1.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieapi1.entity.Movie;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    
    List<Movie> findByGenreIgnoreCase(String genre);

    }
    // Use IgnoreCase for case-insensitive search
