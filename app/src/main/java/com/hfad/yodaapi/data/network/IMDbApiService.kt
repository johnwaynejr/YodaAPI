package com.hfad.yodaapi.data.network

import com.hfad.yodaapi.data.dto.MoviesSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IMDbApiService {
    @GET("/en/API/SearchMovie/k_q6uu72vw/{expression}")
    fun searchMovies(@Path("expression") expression: String): Call<MoviesSearchResponse>
}