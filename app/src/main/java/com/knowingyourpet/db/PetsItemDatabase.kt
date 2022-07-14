package com.knowingyourpet.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.knowingyourpet.PetsResponseItem

@Database(
    entities = [PetsResponseItem::class],
    version = 1
)

 abstract class PetsItemDatabase : RoomDatabase(){

     abstract fun getPetsItemDao(): PetsDao

     companion object {
         private var instance: PetsItemDatabase? = null
         private val LOCK = Any()

         operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
             instance ?: createDatabase(context).also { instance = it }
         }

         private fun createDatabase(context: Context) =
             Room.databaseBuilder(
                 context.applicationContext,
                 PetsItemDatabase::class.java,
                 "petsItem_db.db"
             ).build()


     }
}