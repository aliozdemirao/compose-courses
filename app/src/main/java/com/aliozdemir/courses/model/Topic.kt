package com.aliozdemir.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val titleResId: Int,
    val count: Int,
    @DrawableRes val imageResId: Int
)