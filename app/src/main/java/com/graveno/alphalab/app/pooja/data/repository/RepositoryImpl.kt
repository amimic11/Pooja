package com.graveno.alphalab.app.pooja.data.repository

import android.content.Context
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getDrawable
import com.graveno.alphalab.app.pooja.R
import com.graveno.alphalab.app.pooja.data.db.dao.GodModelDao
import com.graveno.alphalab.app.pooja.data.model.*
import com.graveno.alphalab.app.pooja.util.Common.AartiChip
import com.graveno.alphalab.app.pooja.util.Common.HomeChip
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RepositoryImpl
@Inject constructor(
    private val context: Context,
    private val godModelDao: GodModelDao
    ) : AppRepository {

    private val bnbList = mutableListOf<BottomBarModel>()

    //region flow vars...
    private val _bottomNavigationList = MutableStateFlow(mutableListOf<BottomBarModel>())
    val bottomNavigationList = _bottomNavigationList.asStateFlow()
    //endregion

    //region bottom bar...
    suspend fun prepBottomBarList() {
        withContext(IO) {
            bnbList.clear()
            bnbList.add(
                BottomBarModel(
                    name = context.getString(R.string.home),
                    icon = Icons.Rounded.Home,
                    actionType = HomeChip,
                    selected = true
                )
            )
            bnbList.add(
                BottomBarModel(
                    name = context.getString(R.string.aarti),
                    icon = Icons.Rounded.Search,
                    actionType = AartiChip,
                    selected = false
                )
            )
            bnbList.add(
                BottomBarModel(
                    name = context.getString(R.string.chalisa),
                    icon = Icons.Rounded.Menu,
                    actionType = AartiChip,
                    selected = false
                )
            )
        }
        withContext(IO) {
            _bottomNavigationList.update { bnbList }
        }
    }
    //endregion

}