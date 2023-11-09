package com.kevin.androidmvvmwithrxjava.view.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.kevin.androidmvvmwithrxjava.model.viewmodel.RandomQuoteViewModel
import com.kevin.androidmvvmwithrxjava.view.composables.ItemView


@Composable
fun HomeScreen(viewModel: RandomQuoteViewModel = hiltViewModel()) {


    val error = viewModel.error.observeAsState("")
    error.value?.let {
        if (it.isNotBlank()) {
            Toast.makeText(LocalContext.current, it, Toast.LENGTH_LONG).show()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    )
    {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            items(viewModel.quotationLiveData) {
                ItemView(text = it.quote)
            }
        }

        FloatingActionButton(
            onClick = { viewModel.getQuotation() },
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            Icon(Icons.Filled.Add, "Floating action button.")
        }

    }


}

