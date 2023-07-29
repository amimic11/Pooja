package com.graveno.alphalab.app.pooja.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Chalisa(
    val doha: String,
    val index: Int,
    val line: List<String>
) : Parcelable