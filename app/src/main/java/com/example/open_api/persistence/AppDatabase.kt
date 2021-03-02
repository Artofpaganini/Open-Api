package com.example.open_api.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.open_api.models.AccountProperties
import com.example.open_api.models.AuthToken

@Database(entities = [AuthToken::class, AccountProperties::class], version = 2)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getAuthTokenDao(): AuthTokenDao

    abstract fun getAccountPropertiesDao(): AccountPropertiesDao

    companion object {
        const val DATABASE_NAME = "app_db"
    }
}