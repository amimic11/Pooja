package com.graveno.alphalab.app.pooja.ui.graph

import androidx.compose.runtime.Composable
import com.graveno.alphalab.app.pooja.util.Common.NAAM_ROUTE
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

private const val TAG : String = "NAAM"

@NavGraph
annotation class NaamNavGraph(val start : Boolean = false)

@NaamNavGraph(start = true)
@Destination
@Composable
fun NaamsScreen(navigator: DestinationsNavigator) {

}

@NaamNavGraph
@Destination
@Composable
fun NaamScreen(navigator: DestinationsNavigator) {

}