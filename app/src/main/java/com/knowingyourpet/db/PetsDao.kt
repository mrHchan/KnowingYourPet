package com.knowingyourpet.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.knowingyourpet.PetsResponseItem

@Dao
interface PetsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(petsItem: PetsResponseItem): Long

    @Query("SELECT * FROM breeds")
    fun getAllBreeds(): LiveData<List<PetsResponseItem>>

    @Delete
    suspend fun deletePetsItem(petsItem: PetsResponseItem)
}