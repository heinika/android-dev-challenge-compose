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

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun PuppyList(puppyList: List<Puppy>, onPuppyItemClick: (Puppy) -> Unit = {}) {
    val scrollState = rememberLazyListState()
    LazyColumn(
        state = scrollState,
        modifier = Modifier
            .background(MaterialTheme.colors.secondary)
            .fillMaxWidth(),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(puppyList) { puppy ->
            PuppyItem(
                puppy,
                Modifier
                    .clickable {
                        onPuppyItemClick(puppy)
                    }
                    .fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun DogListPreview() {
    val puppyList = listOf(
        Puppy(
            "Nala", "Pit Bull Terrier Mix", "Sunnyvale, CA",
            "Adult", "Female", "Large", R.drawable.img_puppy_nala
        ),
        Puppy(
            "Lulu", "Terrier Mix", "Sunnyvale, CA",
            "Young", "Female", "Medium", R.drawable.img_puppy_lulu
        ),
        Puppy(
            "Billy", "American Staffordshire Terrier Mix", "Sunnyvale, CA",
            "Adult", "Male", "Large", R.drawable.img_puppy_billy
        )
    )

    MyTheme {
        PuppyList(puppyList)
    }
}
