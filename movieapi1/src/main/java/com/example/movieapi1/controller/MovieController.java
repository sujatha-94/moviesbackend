package com.example.movieapi1.controller;


import com.example.movieapi1.entity.Movie;
import com.example.movieapi1.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Simple GET endpoint to test if the server is running
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to the Movie API!";
    }
   

    @GetMapping("/genre/{genre}")
public ResponseEntity<List<Movie>> getMoviesByGenre(@PathVariable String genre) {
    System.out.println("Fetching movies for genre: " + genre); // Log the genre being queried

    List<Movie> movies = movieService.getMoviesByGenre(genre);

    System.out.println("Movies found for genre " + genre + ": " + movies); // Log the result

    if (movies.isEmpty()) {
        return ResponseEntity.ok(movies); // Return empty list with 200 OK
    }
    return ResponseEntity.ok(movies); // Return list of movies with 200 OK
}
}
