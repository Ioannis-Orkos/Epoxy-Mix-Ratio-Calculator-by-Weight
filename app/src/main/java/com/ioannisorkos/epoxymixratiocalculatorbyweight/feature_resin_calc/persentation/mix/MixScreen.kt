package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.mix



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.ioannisorkos.epoxymixratiocalculatorbyweight.R


@Composable
fun MixScreenAppBar(
) {
//    val appBarTitle =
//        stringResource(if (isEditMode) R.string.edit_reward else R.string.add_reward)
    TopAppBar(
        title = {
            Text( stringResource(id = R.string.mix_screen))
        },
    )
}



@Composable
fun MixScreenContent(
) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Red)) {

    }
}
