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
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.model.Puppy

class MainViewModel : ViewModel() {
    val puppyList by mutableStateOf(
        listOf(
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
            ),
            Puppy(
                "Arnie", "Chihuahua Mix", "Mountain View, CA",
                "Young", "Male", "Small", R.drawable.img_puppy_arnie
            ),
            Puppy(
                "Doby", "Mountain Dog & Shepherd Mix", "Sunnyvale, CA",
                "Puppy", "Female", "Medium", R.drawable.img_puppy_doby
            ),
            Puppy(
                "Bowen", "Mountain Dog & Shepherd Mix", "Sunnyvale, CA",
                "Puppy", "Male", "Medium", R.drawable.img_puppy_bowen
            ),
            Puppy(
                "Rumi", "Border Collie & German Shepherd Dog Mix", "Los Altos, CA",
                "Young", "Male", "Medium", R.drawable.img_puppy_rumi
            ),
            Puppy(
                "Mikey", "Chihuahua & Rat Terrier Mix", "Santa Clara, CA",
                "Young", "Male", "Medium", R.drawable.img_puppy_mikey
            ),
            Puppy(
                "Layla", "Chihuahua & Terrier Mix", "Santa Clara, CA",
                "Young", "Female", "Medium", R.drawable.img_puppy_layla
            ),
            Puppy(
                "Tessie", "Pit Bull Terrier Mix", "Santa Clara, CA",
                "Adult", "Female", "Large", R.drawable.img_puppy_tessie
            ),
            Puppy(
                "Sia", "Pit Bull Terrier", "Santa Clara, CA",
                "Young", "Female", "Medium", R.drawable.img_puppy_sia
            ),
        )
    )

    var currentPuppy: Puppy? by mutableStateOf(null)

    fun showPuppyDetail(puppy: Puppy) {
        currentPuppy = puppy
    }

    fun closePuppyDetail() {
        currentPuppy = null
    }
}
