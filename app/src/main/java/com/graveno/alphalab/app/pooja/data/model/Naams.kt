package com.graveno.alphalab.app.pooja.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Naams(
    val naamlist: List<Naamlist>,
    val title: String
) : Parcelable

val naams_default = Naams(
    naamlist = emptyList(),
    title = ""
)