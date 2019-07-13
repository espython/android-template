package com.example.basicapp.models

import androidx.room.Dao
import androidx.room.Query

@Dao
interface WordDao {

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords():List<Word>
}