package com.zuehlke.movieticketservice.api.ratingservice;

import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * Provides movie ratings:
 * https://movie-rating-service.herokuapp.com/swagger-ui.html#!/rating-controller
 */
public interface RatingServiceApi {

    @RequestLine("GET /api/v1/ratings/{id}")
    List<RatingResponse> getRatingsByMovieId(@Param("id") int id);

    @RequestLine("GET /health")
    void getHealthStatus();
}