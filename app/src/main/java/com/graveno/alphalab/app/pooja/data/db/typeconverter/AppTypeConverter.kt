package com.graveno.alphalab.app.pooja.data.db.typeconverter

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.graveno.alphalab.app.pooja.data.model.Chalisa
import com.graveno.alphalab.app.pooja.data.model.Family
import com.graveno.alphalab.app.pooja.data.model.Naams
import com.graveno.alphalab.app.pooja.data.model.family_default
import com.graveno.alphalab.app.pooja.data.model.naams_default
import org.json.JSONArray
import org.json.JSONObject

@TypeConverters
class AppTypeConverter {
    val gson = Gson()
    val json_default_str = gson.toJson(JSONObject())
    val json_array_default = gson.toJson(JSONArray())

    //region aarti...
    @TypeConverter
    fun aartiToStr(aartis : List<String>?) : String = aartis?.let { gson.toJson(it) } ?: json_array_default
    @TypeConverter
    fun strToAarti(str : String?) : List<String> = str?.let { gson.fromJson(str, object : TypeToken<List<String>>() {}.type) } ?: emptyList()
    //endregion

    //region chalisa...
    @TypeConverter
    fun chalisaToStr(chalisa : List<Chalisa>?) : String = chalisa?.let { gson.toJson(it) } ?: json_array_default
    @TypeConverter
    fun strToChalisa(str : String?) : List<Chalisa> = str?.let { gson.fromJson(str, object : TypeToken<List<Chalisa>>() {}.type) } ?: emptyList()
    //endregion

    //region family...
    @TypeConverter
    fun familyToStr(family : Family?) : String = family?.let { gson.toJson(it) } ?: json_default_str
    @TypeConverter
    fun strToFamilt(str : String?) : Family = str?.let { gson.fromJson(str, object : TypeToken<Family>() {}.type) } ?: family_default
    //endregion

    //region naam...
    @TypeConverter
    fun naamsToStr(family : Naams?) : String = family?.let { gson.toJson(it) } ?: json_default_str
    @TypeConverter
    fun strToNaams(str : String?) : Naams = str?.let { gson.fromJson(str, object : TypeToken<Naams>() {}.type) } ?: naams_default
    //endregion
}