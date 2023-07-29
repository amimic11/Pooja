package com.graveno.alphalab.app.pooja.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Naamlist(
    val mantra: Mantra,
    val naam: Naam
) : Parcelable