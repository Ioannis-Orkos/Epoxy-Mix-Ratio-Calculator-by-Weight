package com.ioannisorkos.epoxymixratiocalculatorbyweight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.util.ARG_HIDE_BOTTOM_BAR
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.util.ScreensDetail
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation.util.allScreens
import com.ioannisorkos.epoxymixratiocalculatorbyweight.feature_resin_calc.persentation._screenspecs.ScreenSpec
import com.ioannisorkos.epoxymixratiocalculatorbyweight.ui.theme.EpoxyMixRatioCalculatorByWeightTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EpoxyMixRatioCalculatorByWeightTheme {
                ScreenContent()
            }
        }
    }
}






@Composable
private fun ScreenContent() {

    val scaffoldState = rememberScaffoldState()

    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val screenSpec = ScreenSpec.allScreensSpec[currentDestination?.route]

    Scaffold(
        scaffoldState = scaffoldState,

        topBar = {
            val navBackStackEntry = navBackStackEntry
            if (navBackStackEntry != null) {
                screenSpec?.TopBar(navController, navBackStackEntry)
            }
        },

        bottomBar = {
            val hideBottomBar = navBackStackEntry?.arguments?.getBoolean(ARG_HIDE_BOTTOM_BAR)

            if (hideBottomBar == null || !hideBottomBar) {
                BottomNavigation {
                    allScreens.forEach { bottomNavDestination ->
                        BottomNavigationItem(
                            icon = {
                                Icon(bottomNavDestination.icon, contentDescription = null)
                            },
                            label = {
                                Text(stringResource(bottomNavDestination.label))
                            },
                            alwaysShowLabel = false,
                            selected = currentDestination?.hierarchy?.any { it.route == bottomNavDestination.route} == true,
                            onClick = {
                                // TODO: 29/12/2021 Navigate to start destination not working after deep link -> library bug.
                                //  Switch back to onNewIntent if bug doesn't get fixed
                                //  Workaround: https://issuetracker.google.com/issues/194301895
                                navController.navigate(bottomNavDestination.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = ScreensDetail.MixScreenDet.route,
            modifier = Modifier.padding(innerPadding),
        ) {
            ScreenSpec.allScreensSpec.values.forEach { screen ->
                composable(
                    route = screen.navHostRoute,
                    arguments = screen.arguments,
                    deepLinks = screen.deepLinks,
                ) { navBackStackEntry ->
                    screen.Content(
                        navController = navController,
                        navBackStackEntry = navBackStackEntry
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenContentPreview() {
    EpoxyMixRatioCalculatorByWeightTheme() {
        ScreenContent()
    }
}

































//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    EpoxyMixRatioCalculatorByWeightTheme {
//        Greeting("Android")
//    }
//}