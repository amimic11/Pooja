package com.graveno.alphalab.app.pooja.ui.graph

import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

private const val TAG : String = "Chalisa_graph"

@NavGraph
annotation class ChalisaNavGraph(val start : Boolean = false)

@ChalisaNavGraph(start = true)
@Destination
@Composable
fun ChalisaListScreen(navigator: DestinationsNavigator, rootNavigator: RootNavigator) {

}

@ChalisaNavGraph
@Destination
@Composable
fun ChalisaScreen(navigator: DestinationsNavigator, rootNavigator: RootNavigator) {

}