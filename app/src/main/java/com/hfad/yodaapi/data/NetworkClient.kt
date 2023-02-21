package com.hfad.yodaapi.data

import com.hfad.yodaapi.data.dto.Response

interface NetworkClient {
    fun doRequest(dto: Any): Response

}