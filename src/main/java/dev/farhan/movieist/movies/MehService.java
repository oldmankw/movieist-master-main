package dev.farhan.movieist.movies;

import org.springframework.stereotype.Service;

@Service
public class MehService {

    public String movieStatus()
    {
        return "movie is still in the cycle";
    }
    
}
