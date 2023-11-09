package com.kevin.androidmvvmwithrxjava.model.repo.api

import com.kevin.androidmvvmwithrxjava.model.data.AnimeQuotation
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiService {

    @GET("api/random")
     fun getRandomQuotation(): Single<AnimeQuotation>
}