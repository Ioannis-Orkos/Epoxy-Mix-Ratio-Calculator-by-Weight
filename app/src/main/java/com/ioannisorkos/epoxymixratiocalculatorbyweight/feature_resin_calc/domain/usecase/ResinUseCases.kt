package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.domain.usecase

data class ResinUseCases(

    val addResin: AddResin,
    val updateResin: UpdateResin,
    val getResins: GetResins,
    val getResinById: GetResinById,
    val delResin: DelResin,


    val addMixHistory: AddMixHistory,
    val getResinsWithHistory: GetResinsWithHistory,
    val getResinsWithHistoryByID: GetResinsWithHistoryByID,

    )
