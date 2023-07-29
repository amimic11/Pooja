package com.graveno.alphalab.app.pooja.ui.graph

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.compose.ComposeNavigator
import com.graveno.alphalab.app.pooja.util.Common
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

private const val TAG : String = "AARTI"

@NavGraph
annotation class AartiNavGraph(val start : Boolean = false)

@AartiNavGraph(start = true)
@Destination
@Composable
fun AartisScreen(
    destinationsNavigator: DestinationsNavigator
) {

}

@AartiNavGraph
@Destination
@Composable
fun AartiScreen(destinationsNavigator: DestinationsNavigator) {

}