package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.data.repository


import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.data.local.ResinDao
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.MixHistory
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.Resin
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.ResinAndHistory
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.repository.ResinRepository
import kotlinx.coroutines.flow.Flow

class ResinRepositoryImpl(
    private val dao: ResinDao
): ResinRepository {

    //Resin
    override suspend fun insertResin(resin: Resin):Long{
        return dao.insertResin(resin)
    }

    override suspend fun updateResin(resin: Resin) {
         dao.updateResin(resin)
    }

    override suspend fun deleteResin(resin: Resin?){
        dao.deleteResin(resin)
    }

    override suspend fun getResinById(id: Int): Resin? {
        return dao.getResinById(id)
    }

    override fun getResins(): Flow<List<Resin>> {
        return dao.getResins()
    }


    //Resin history
    override suspend fun insertMixHistory(mixHistory: MixHistory):Long {
        return dao.insertMixHistory(mixHistory)
    }

    override fun getResinAndMixHistoriesByID(id: Int): ResinAndHistory? {
        return dao.getResinAndMixHistoriesByID(id)
    }

    override fun getResinsAndMixHistories(): Flow<List<ResinAndHistory>> {
        return dao.getResinsAndMixHistories()
    }

}