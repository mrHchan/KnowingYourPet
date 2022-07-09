package com.knowingyourpet

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "breeds"
)
data class PetsResponseItem(
    @PrimaryKey(autoGenerate = true)
    val bred_for: String,
    val breed_group: String,
    val country_code: String,
    val description: String,
    val height: Height,
    val history: String,
    val id: Int? = null,
    val image: Image,
    val life_span: String,
    val name: String,
    val origin: String,
    val reference_image_id: String,
    val temperament: String,
    val weight: Weight
)