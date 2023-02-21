package com.hfad.yodaapi.data.dto

import com.hfad.yodaapi.domain.models.Movie

class MoviesSearchResponse(val searchType: String,
                           val expression: String,
                           val results: List<MovieDto>):Response()