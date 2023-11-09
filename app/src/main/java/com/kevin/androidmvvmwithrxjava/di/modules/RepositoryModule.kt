package com.kevin.androidmvvmwithrxjava.di.modules

import com.kevin.androidmvvmwithrxjava.model.repo.IQuoteRepository
import com.kevin.androidmvvmwithrxjava.model.repo.QuoteRepository
import com.kevin.androidmvvmwithrxjava.model.repo.api.QuoteApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(quoteApiService: QuoteApiService): IQuoteRepository {
        return QuoteRepository(quoteApiService)
    }
}