package com.knowingyourpet.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.knowingyourpet.PetsResponseItem

@Database(
    entities = [PetsResponseItem::class],
    version = 1
)

 abstract class PetsItemDatabase : RoomDatabase(){

     abstract fun getPetsItemDao(): PetsDao
}