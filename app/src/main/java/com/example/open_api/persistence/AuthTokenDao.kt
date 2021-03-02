package com.example.open_api.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.open_api.models.AuthToken

@Dao
interface AuthTokenDao {

    // когда мы  делаем логин  мы закидываем токен
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(authToken: AuthToken):Long

    // когда мы  делаем логаут  мы вытаскиваем токен
    @Query("UPDATE auth_token SET token = null WHERE account_pk=:pk")
    fun nullifyToken(pk:Int):Int

}