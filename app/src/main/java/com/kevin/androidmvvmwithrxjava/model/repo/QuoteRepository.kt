package com.kevin.androidmvvmwithrxjava.model.repo

import com.kevin.androidmvvmwithrxjava.model.repo.api.QuoteApiService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val quoteApiService: QuoteApiService) :
    IQuoteRepository {
    override  fun getRandomQuotation() = quoteApiService.getRandomQuotation()
}