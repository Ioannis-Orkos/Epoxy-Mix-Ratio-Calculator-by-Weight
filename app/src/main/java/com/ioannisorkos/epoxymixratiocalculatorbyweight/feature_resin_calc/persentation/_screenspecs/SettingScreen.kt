package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation._screenspecs

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.setting.SettingScreenAppBar
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.setting.SettingScreenContent
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.util.ScreensDetail


object SettingScreen : ScreenSpec {
    override val navHostRoute: String = ScreensDetail.SettingScreenDet.route

//    override val deepLinks: List<NavDeepLink> = listOf(
//        navDeepLink {
//            uriPattern = "https://www.incentivetimer.com/timer"
//        }
//    )

    @Composable
    override fun TopBar(navController: NavController, navBackStackEntry: NavBackStackEntry) {
//        val viewModel: TimerViewModel = hiltViewModel(navBackStackEntry)
//        val pomodoroTimerState by viewModel.pomodoroTimerState.observeAsState()
//        TimerScreenAppBar(
//            pomodoroTimerState = pomodoroTimerState,
//            actions = viewModel
//        )
        SettingScreenAppBar()
    }

    @Composable
    override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {
//        val viewModel: TimerViewModel = hiltViewModel(navBackStackEntry)
//        val pomodoroTimerState by viewModel.pomodoroTimerState.observeAsState()
//        val showResetTimerConfirmationDialog
//                by viewModel.showResetTimerConfirmationDialog.observeAsState(false)
//        val showSkipBreakConfirmationDialog
//                by viewModel.showSkipBreakConfirmationDialog.observeAsState(false)
//        val showResetPomodoroSetConfirmationDialog
//                by viewModel.showResetPomodoroSetConfirmationDialog.observeAsState(false)
//        val showResetPomodoroCountConfirmationDialog
//                by viewModel.showResetPomodoroCountConfirmationDialog.observeAsState(false)
//
//        TimerScreenContent(
//            pomodoroTimerState = pomodoroTimerState,
//            actions = viewModel,
//            showResetTimerConfirmationDialog = showResetTimerConfirmationDialog,
//            showSkipBreakConfirmationDialog = showSkipBreakConfirmationDialog,
//            showResetPomodoroSetConfirmationDialog = showResetPomodoroSetConfirmationDialog,
//            showResetPomodoroCountConfirmationDialog = showResetPomodoroCountConfirmationDialog,
//        )
        SettingScreenContent()
    }
}