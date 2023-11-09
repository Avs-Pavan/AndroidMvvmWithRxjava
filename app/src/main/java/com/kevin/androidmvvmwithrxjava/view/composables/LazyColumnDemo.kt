package com.kevin.androidmvvmwithrxjava.view.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


// ItemView is a composable that displays a text.
@Composable
fun ItemView(text: String) {
    Text(
        text = text, modifier = Modifier
            .fillMaxWidth()
            .background(Color.Cyan, shape = RoundedCornerShape(corner = CornerSize(12.dp)))
            .padding(20.dp)
    )
    Spacer(modifier = Modifier.height(10.dp))
}
