package com.example.ch6.data.remote

import com.example.ch6.data.remote.response.toMovie
import com.example.ch6.data.remote.service.SpoonacularService
import com.example.ch6.domain.Movie
import com.example.ch6.domain.repository.HomeRepository
import com.example.ch6.domain.repository.MovieRepository

class RemoteRepository(
    private val spoonacularService: SpoonacularService,
) : MovieRepository {
    override suspend fun fetchMovies(): List<Movie> {
        return spoonacularService.fetchMovies().menuItems?.map { result -> result.toMovie() }.orEmpty()
    }
}