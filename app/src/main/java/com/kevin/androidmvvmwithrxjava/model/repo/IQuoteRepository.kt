package com.kevin.androidmvvmwithrxjava.model.repo

import com.kevin.androidmvvmwithrxjava.model.data.AnimeQuotation
import io.reactivex.Single
import retrofit2.Response

interface IQuoteRepository {
     fun getRandomQuotation(): Single<AnimeQuotation>
}