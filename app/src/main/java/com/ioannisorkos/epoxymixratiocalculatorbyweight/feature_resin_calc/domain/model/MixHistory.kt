package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
data class MixHistory(
    val resinMixId:Int,
    val totalMix:Float,
    val usedPercentage:Float? = null,
    val reason:String? = null,
    val timestamp:Long,

    @PrimaryKey(autoGenerate = true)  val id:Int? = null
)

class InvalidResinHistoryDataException(message: String): Exception(message)