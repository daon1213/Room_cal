package com.daon.cal_part2_04

import androidx.room.Database
import androidx.room.RoomDatabase
import com.daon.cal_part2_04.dao.HistroyDao
import com.daon.cal_part2_04.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistroyDao
}