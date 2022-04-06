package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.MixHistory
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.Resin

@Database(
    entities = [Resin::class, MixHistory::class],
    version = 1
)
abstract class ResinDatabase: RoomDatabase() {

    abstract val resinDao: ResinDao

    companion object {
        const val DATABASE_NAME = "resins_db"
    }
}