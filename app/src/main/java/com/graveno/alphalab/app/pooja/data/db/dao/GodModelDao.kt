package com.graveno.alphalab.app.pooja.data.db.dao

import androidx.room.*
import com.graveno.alphalab.app.pooja.data.model.Chalisa
import com.graveno.alphalab.app.pooja.data.model.Family
import com.graveno.alphalab.app.pooja.data.model.God
import com.graveno.alphalab.app.pooja.data.model.Naams
import kotlinx.coroutines.flow.Flow

@Dao
interface GodModelDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllGodModel(gods : List<God>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertGodModel(god : God)

    @Query("SELECT * FROM God")
    fun fetchAllGod() : Flow<List<God>>

//    @Query("Select * From God where godName = :name")
//    fun fetchGod(name : String) : Flow<God>
//
//    @Query("Select Chalisa From God where godName = :name")
//    fun fetchChalisa(name: String) : Flow<List<Chalisa>>
//
//    @Query("Select Aarti From God where godName = :name")
//    fun fetchAarti(name: String) : Flow<List<String>>
//
//    @Query("Select Naams From God where godName = :name")
//    fun fetchNaams(name: String) : Flow<Naams>
//
//    @Query("Select Family From God where godName = :name")
//    fun fetchFamily (name: String) : Flow<Family>
}