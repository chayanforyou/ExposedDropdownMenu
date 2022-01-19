package me.chayan.exposeddropdownmenu.utils

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import me.chayan.exposeddropdownmenu.R
import me.chayan.exposeddropdownmenu.model.District
import me.chayan.exposeddropdownmenu.model.Division
import java.io.InputStreamReader
import java.io.Reader

object Utils {

    fun getDistricts(context: Context): List<District> {
        val reader: Reader = InputStreamReader(context.resources.openRawResource(R.raw.districts))
        val reviewType = object : TypeToken<List<District>>() {}.type
        return Gson().fromJson(reader, reviewType)
    }

    fun getDivisions(context: Context): List<Division> {
        val reader: Reader = InputStreamReader(context.resources.openRawResource(R.raw.divisions))
        val reviewType = object : TypeToken<List<Division>>() {}.type
        return Gson().fromJson(reader, reviewType)
    }
}