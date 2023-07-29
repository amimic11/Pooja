package com.graveno.alphalab.app.pooja.data.model

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomBarModel(
    var name : String?,
    var icon : ImageVector,
    var actionType : Int,
    var selected : Boolean
)