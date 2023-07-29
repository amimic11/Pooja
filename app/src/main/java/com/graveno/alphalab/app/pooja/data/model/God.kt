package com.graveno.alphalab.app.pooja.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "God")
@Parcelize
data class God(
    @PrimaryKey(autoGenerate = false) val godName: String,
    @ColumnInfo(name = "aarti") val aarti: List<String>?,
    @ColumnInfo(name = "chalisa") val chalisa: List<Chalisa>?,
    @ColumnInfo(name = "family") val family: Family?,
    @ColumnInfo(name = "naams") val naams: Naams?
) : Parcelable