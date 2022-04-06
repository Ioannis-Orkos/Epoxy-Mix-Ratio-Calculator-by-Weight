package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.usecase


import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model.ResinAndHistory
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.repository.ResinRepository
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.util.OrderType
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.util.ResinOrder
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetResinsWithHistory(
    private  val repository: ResinRepository
) {

    operator fun invoke(
        resinOrder: ResinOrder = ResinOrder.Date(OrderType.Ascending)
    ): Flow<List<ResinAndHistory>> {
        return repository.getResinsAndMixHistories().map { resinsWithHistory ->
            when(resinOrder.orderType){
                is OrderType.Ascending -> {
                    when(resinOrder){
                        is ResinOrder.Date  -> resinsWithHistory.sortedBy {it.resin.timestamp }
                        is ResinOrder.PartName  -> resinsWithHistory.sortedBy {it.resin.partName}
                    }
                }

                is OrderType.Descending -> {
                    when(resinOrder) {
                        is ResinOrder.Date -> resinsWithHistory.sortedByDescending {it.resin.timestamp  }
                        is ResinOrder.PartName -> resinsWithHistory.sortedByDescending {it.resin.partName }
                    }
                }
            }
        }

    }


}