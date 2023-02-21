package com.hfad.yodaapi.data.network

import com.hfad.yodaapi.data.NetworkClient
import com.hfad.yodaapi.data.dto.MoviesSearchRequest
import com.hfad.yodaapi.data.dto.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitNetworkClient : NetworkClient {

    private val imdbBaseUrl = "https://imdb-api.com"

    private val retrofit = Retrofit.Builder()
        .baseUrl(imdbBaseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val imdbService = retrofit.create(IMDbApiService::class.java)

    override fun doRequest(dto: Any): Response {
        if (dto is MoviesSearchRequest) {
            val resp = imdbService.searchMovies(dto.expression).execute()

            val body = resp.body() ?: Response()

            return body.apply { resultCode = resp.code() }
        } else {
            return Response().apply { resultCode = 400 }
        }
    }
}