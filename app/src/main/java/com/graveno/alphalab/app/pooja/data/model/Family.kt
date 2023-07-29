package com.graveno.alphalab.app.pooja.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Family(
    val parents: Parents
) : Parcelable

val family_default = Family(
    Parents(
        father = "",
        mother = ""
    )
)