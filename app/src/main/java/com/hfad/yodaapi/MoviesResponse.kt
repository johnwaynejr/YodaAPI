package com.hfad.yodaapi

class MoviesResponse(val searchType: String,
                     val expression: String,
                     val results: List<Movie>)