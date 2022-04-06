package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.usecase

import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.Resin
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.repository.ResinRepository


class GetResinById(
    private  val repository: ResinRepository
) {

    suspend operator fun invoke(id:Int): Resin? {
        return repository.getResinById(id)
    }


}