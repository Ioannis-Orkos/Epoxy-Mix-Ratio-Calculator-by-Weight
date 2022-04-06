package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.usecase

import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.ResinAndHistory
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.repository.ResinRepository


class GetResinsWithHistoryByID(
    private  val repository: ResinRepository
) {

    operator fun invoke(id:Int): ResinAndHistory? {
        return repository.getResinAndMixHistoriesByID(id)
    }


}