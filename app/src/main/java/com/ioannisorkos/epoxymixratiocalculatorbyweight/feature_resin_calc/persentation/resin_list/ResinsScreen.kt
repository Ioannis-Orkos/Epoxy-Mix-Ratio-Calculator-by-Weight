package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.resin_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.ioannisorkos.epoxymixratiocalculatorbyweight.R


@Composable
fun ResinsScreenAppBar(
) {
    TopAppBar(
        title = {
            Text( stringResource(R.string.resin_list_screen))
        },
    )
}



@Composable
fun ResinsScreenContent(
) {
    Box(Modifier.fillMaxSize().background(Color.Blue)) {

    }
}
