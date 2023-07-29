package com.graveno.alphalab.app.pooja.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mantra(
    val english: String,
    val hindi: String
) : Parcelable