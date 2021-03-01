/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Puppy

@Composable
fun PuppyDetail(puppy: Puppy, onAdoptClick: (Puppy) -> Unit = {}) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.secondary)
            .verticalScroll(scrollState),
    ) {
        Image(
            painter = painterResource(
                id = puppy.drawableRes
            ),
            contentDescription = "puppy image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.aspectRatio(1f)
        )

        Column(
            Modifier
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Name: ${puppy.name}", style = MaterialTheme.typography.h3)
            ProvideTextStyle(MaterialTheme.typography.h5) {
                Text("Breed: ${puppy.breed}")
                Text("Location: ${puppy.location}")
                Text("Age: ${puppy.age}")
                Text("Gender: ${puppy.gender}")
                Text("Size: ${puppy.size}")
            }
            Button(onClick = { onAdoptClick(puppy) }, modifier = Modifier.padding(16.dp)) {
                Text(text = "Adopt ${puppy.name}")
            }
        }
    }
}

@Preview
@Composable
fun PuppyDetailsPreview() {
    PuppyDetail(
        puppy = Puppy(
            "Nala", "Pit Bull Terrier Mix", "Sunnyvale, CA",
            "Adult", "Female", "Large", R.drawable.img_puppy_nala
        )
    )
}
