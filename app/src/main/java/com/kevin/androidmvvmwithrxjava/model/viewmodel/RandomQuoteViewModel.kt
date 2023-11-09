package com.kevin.androidmvvmwithrxjava.model.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kevin.androidmvvmwithrxjava.model.data.AnimeQuotation
import com.kevin.androidmvvmwithrxjava.model.repo.QuoteRepository
import com.kevin.androidmvvmwithrxjava.util.network.APIResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class RandomQuoteViewModel @Inject constructor(private val quoteRepository: QuoteRepository) :
    ViewModel() {


    // exposed live data
    val quotationLiveData = mutableStateListOf<AnimeQuotation>()

    private val _error = MutableLiveData<String>()
    val error: LiveData<String>
        get() = _error

    private val compositeDisposable = CompositeDisposable()

    fun getQuotation() {
        viewModelScope.launch(Dispatchers.IO) {
            val disposable = quoteRepository.getRandomQuotation()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        quotationLiveData.add(it)
                    }, {
                        _error.postValue("Some thing went wrong ${it.message}")
                    }
                )
            compositeDisposable.add(disposable)
        }
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

}