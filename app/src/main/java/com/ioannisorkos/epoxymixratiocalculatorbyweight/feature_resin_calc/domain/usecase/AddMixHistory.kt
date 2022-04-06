package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.usecase

import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.InvalidResinHistoryDataException
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.MixHistory
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.repository.ResinRepository


class AddMixHistory (
    private val repository: ResinRepository
) {

    @Throws(InvalidResinHistoryDataException::class)
    suspend operator fun invoke(mixHistory: MixHistory):Long {
        if(mixHistory.totalMix.isNaN()) {
            throw InvalidResinHistoryDataException("The total mix  can't be empty.")
        }

        return repository.insertMixHistory(mixHistory)
    }

}

