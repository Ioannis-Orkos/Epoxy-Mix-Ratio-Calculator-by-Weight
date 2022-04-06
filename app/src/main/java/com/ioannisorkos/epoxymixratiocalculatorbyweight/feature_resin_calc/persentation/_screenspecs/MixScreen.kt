package com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation._screenspecs


import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.mix.MixScreenAppBar
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.mix.MixScreenContent
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.util.ScreensDetail


object MixScreen : ScreenSpec {
    override val navHostRoute: String = ScreensDetail.MixScreenDet.route

//    override val deepLinks: List<NavDeepLink> = listOf(
//        navDeepLink {
//            uriPattern = "https://www.incentivetimer.com/reward_list"
//        }
//    )

    @Composable
    override fun TopBar(navController: NavController, navBackStackEntry: NavBackStackEntry) {
//        val viewModel: RewardListViewModel = hiltViewModel(navBackStackEntry)
//        val multiSelectionModeActive by viewModel.multiSelectionModeActive.observeAsState(false)
//        val selectedItemCount by viewModel.selectedItemCount.observeAsState(0)
//
//        RewardListScreenAppBar(
//            multiSelectionModeActive = multiSelectionModeActive,
//            selectedItemCount = selectedItemCount,
//            actions = viewModel,
//        )

        MixScreenAppBar()
    }

    @Composable
    override fun Content(navController: NavController, navBackStackEntry: NavBackStackEntry) {
//        val viewModel: RewardListViewModel = hiltViewModel(navBackStackEntry)
//        val rewards by viewModel.rewards.observeAsState(listOf())
//        val selectedRewards by viewModel.selectedRewards.observeAsState(listOf())
//        val showDeleteAllUnlockedRewardsDialog
//                by viewModel.showDeleteAllUnlockedRewardsDialog.observeAsState(false)
//        val showDeleteAllSelectedRewardsDialog
//                by viewModel.showDeleteAllSelectedRewardsDialog.observeAsState(false)
//
//        val scaffoldState = rememberScaffoldState()
//
//        val context = LocalContext.current
//
//        LaunchedEffect(Unit) {
//            viewModel.events.collectLatest { event ->
//                when (event) {
//                    is RewardListViewModel.Event.ShowUndoRewardSnackbar -> {
//                        val snackbarResult = scaffoldState.snackbarHostState.showSnackbar(
//                            message = context.getString(R.string.reward_deleted),
//                            actionLabel = context.getString(R.string.undo),
//                        )
//                        if (snackbarResult == SnackbarResult.ActionPerformed) {
//                            viewModel.onUndoDeleteRewardConfirmed(event.reward)
//                        }
//                        Unit
//                    }
//                    is RewardListViewModel.Event.NavigateToEditRewardScreen -> {
//                        navController.navigate(AddEditRewardScreenSpec.buildRoute(event.reward.id))
//                    }
//                }.exhaustive
//            }
//        }
//
//        val addEditRewardResult = navController.currentBackStackEntry
//            ?.savedStateHandle?.getLiveData<String>(ADD_EDIT_REWARD_RESULT)?.observeAsState()
//
//        LaunchedEffect(key1 = addEditRewardResult) {
//            navController.currentBackStackEntry?.savedStateHandle?.remove<String>(
//                ADD_EDIT_REWARD_RESULT
//            )
//            addEditRewardResult?.value?.let { addEditRewardResult ->
//                when (addEditRewardResult) {
//                    RESULT_REWARD_ADDED -> {
//                        scaffoldState.snackbarHostState.showSnackbar(context.getString(R.string.reward_added))
//                    }
//                    RESULT_REWARD_UPDATED -> {
//                        scaffoldState.snackbarHostState.showSnackbar(context.getString(R.string.reward_updated))
//                    }
//                    RESULT_REWARD_DELETE -> {
//                        scaffoldState.snackbarHostState.showSnackbar(context.getString(R.string.reward_deleted))
//                    }
//                }
//            }
//        }
//
//        RewardListScreenContent(
//            rewards = rewards,
//            showDeleteAllUnlockedRewardsDialog = showDeleteAllUnlockedRewardsDialog,
//            showDeleteAllSelectedRewardsDialog = showDeleteAllSelectedRewardsDialog,
//            selectedRewards = selectedRewards,
//            onAddNewRewardClicked = {
//                navController.navigate(AddEditRewardScreenSpec.buildRoute())
//            },
//            scaffoldState = scaffoldState,
//            actions = viewModel,
//        )
        MixScreenContent()

    }
}