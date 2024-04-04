package com.example.consumoapi


import com.google.gson.annotations.SerializedName

data class Fact(
    @SerializedName("_id") val id: String,
    @SerializedName("__v") val v: Int,
    @SerializedName("text") val text: String,
    @SerializedName("updatedAt") val updatedAt: String,
    @SerializedName("deleted") val deleted: Boolean,
    @SerializedName("source") val source: String,
    @SerializedName("sentCount") val sentCount: Int
)