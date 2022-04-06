package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.data.local

import androidx.room.*
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.MixHistory
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.Resin
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.ResinAndHistory
import kotlinx.coroutines.flow.Flow

@Dao
interface ResinDao {

    //Resin
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertResin(resin: Resin):Long

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun updateResin(resin: Resin?)

    @Delete
    suspend fun deleteResin(resin: Resin?)

    @Query("SELECT * FROM Resin WHERE resinId = :id")
    suspend fun getResinById(id: Int): Resin?

    @Query("SELECT * FROM Resin")
    fun getResins(): Flow<List<Resin>>


    //Resin history
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertMixHistory(mixHistory: MixHistory):Long

    @Transaction
    @Query("SELECT * FROM Resin WHERE resinId = :id")
    fun getResinAndMixHistoriesByID(id: Int): ResinAndHistory?

    @Transaction
    @Query("SELECT * FROM Resin ")
    fun getResinsAndMixHistories(): Flow<List<ResinAndHistory>>

}