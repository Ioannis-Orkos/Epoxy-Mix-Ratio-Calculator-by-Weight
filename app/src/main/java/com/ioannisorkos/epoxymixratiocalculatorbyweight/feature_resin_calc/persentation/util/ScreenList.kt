package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.util

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.ioannisorkos.epoxymixratiocalculatorbyweight.R


sealed class ScreensDetail(val route:String, val title:String, val icon:ImageVector,@StringRes val label: Int){

    object MixScreenDet: ScreensDetail("mix_screen","Mix", Icons.Filled.Home, R.string.mix_screen )
    object ResinListScreenDet: ScreensDetail("resin_list_screen","Resins", Icons.Filled.List,R.string.resin_list_screen )
    object SettingScreenDet: ScreensDetail("setting_screen","Setting", Icons.Filled.Settings,R.string.setting_screen)

}


val allScreens:List<ScreensDetail> = listOf(
    ScreensDetail.MixScreenDet,
    ScreensDetail.ResinListScreenDet,
    ScreensDetail.SettingScreenDet
)


const val ARG_HIDE_BOTTOM_BAR = "ARG_HIDE_BOTTOM_BAR"