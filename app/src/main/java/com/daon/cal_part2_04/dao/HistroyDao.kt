package com.daon.cal_part2_04.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.daon.cal_part2_04.model.History

@Dao
interface HistroyDao {

    @Query("SELECT * FROM history")
    fun getAll(): List<History>

    @Insert
    fun insertHistroy(history: History)

    @Query("DELETE FROM history")
    fun deleteAll()

}