package me.chayan.exposeddropdownmenu.model

import com.google.gson.annotations.SerializedName

data class Division(
    @SerializedName("id") var id: Int,
    @SerializedName("division_name_english") var divisionNameEnglish: String,
    @SerializedName("division_name_bangla") var divisionNameBangla: String
) {
    override fun toString(): String {
        return divisionNameBangla
    }
}
