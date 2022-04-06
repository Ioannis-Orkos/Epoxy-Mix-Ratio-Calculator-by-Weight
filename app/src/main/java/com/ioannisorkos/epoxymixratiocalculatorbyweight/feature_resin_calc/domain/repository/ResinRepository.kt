package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.repository

import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.MixHistory
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.Resin
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.ResinAndHistory
import kotlinx.coroutines.flow.Flow

interface ResinRepository {


    //Resin
    suspend fun insertResin(resin: Resin): Long
    suspend fun updateResin(resin: Resin)
    suspend fun deleteResin(resin: Resin?)

    suspend fun getResinById(ResinID: Int): Resin?
    fun getResins(): Flow<List<Resin>>


    //Resin history
    suspend fun insertMixHistory(mixHistory: MixHistory): Long

    fun getResinAndMixHistoriesByID(ResinID: Int): ResinAndHistory?
    fun getResinsAndMixHistories(): Flow<List<ResinAndHistory>>

}