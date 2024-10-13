package com.example.movieapi1.service;


import com.example.movieapi1.entity.Movie;
import com.example.movieapi1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

 // Assuming you're using Spring Data JPA
    
        public List<Movie> getMoviesByGenre(String genre) {
            // Assuming genre is stored in a case-insensitive way
            return movieRepository.findByGenreIgnoreCase(genre);
        }

    
    

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
