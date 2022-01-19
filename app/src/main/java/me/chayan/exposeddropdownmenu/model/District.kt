package me.chayan.exposeddropdownmenu.model

import com.google.gson.annotations.SerializedName

data class District(
    @SerializedName("id") var id: Int,
    @SerializedName("division_id") var divisionId: Int,
    @SerializedName("district_name_english") var districtNameEnglish: String,
    @SerializedName("district_name_bangla") var districtNameBangla: String,
    @SerializedName("latitude") var latitude: Double,
    @SerializedName("longitude") var longitude: Double
) {
    override fun toString(): String {
        return districtNameBangla
    }
}
