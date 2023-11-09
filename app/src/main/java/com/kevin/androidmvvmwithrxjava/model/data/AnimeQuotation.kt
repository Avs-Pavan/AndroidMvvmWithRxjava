package com.kevin.androidmvvmwithrxjava.model.data

data class AnimeQuotation(
    val anime: String,
    val character: String,
    val quote: String
) {
    companion object {
        val empty = AnimeQuotation("", "", "")
    }
}