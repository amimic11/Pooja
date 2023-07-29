package com.graveno.alphalab.app.pooja.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Parents(
    val father: String,
    val mother: String
) : Parcelable