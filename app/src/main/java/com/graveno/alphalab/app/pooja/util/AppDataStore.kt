package com.graveno.alphalab.app.pooja.util

import android.content.Context
import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import java.util.prefs.Preferences

object AppDataStore {

    const val TAG : String = "AppDataStore"
    const val APP_DATA_STORE : String = "app_data_store"
    const val TOKEN_DATA_STORE : String = "token_data_store"

//    private val Context.appDataStore : DataStore<Preferences> by preferencesDataStore(
//        name = APP_DATA_STORE,
//        corruptionHandler = ReplaceFileCorruptionHandler { corruptionException ->  Log.e(TAG, "found corrupted data as ${corruptionException.localizedMessage}")},
//        scope =
//
//    )

}