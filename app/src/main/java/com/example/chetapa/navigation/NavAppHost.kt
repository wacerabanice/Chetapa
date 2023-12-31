package com.example.chetapa.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chetapa.ui.theme.auth.AuthViewModel
import com.example.chetapa.ui.theme.auth.LoginScreen
import com.example.chetapa.ui.theme.auth.ProfileScreen
import com.example.chetapa.ui.theme.auth.SignupScreen
import com.example.chetapa.ui.theme.auth.about.About
import com.example.chetapa.ui.theme.home.HomeScreen
import com.example.chetapa.ui.theme.auth.ProfileScreen


@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_LOGIN
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(viewModel, navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(viewModel, navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(viewModel, navController)
        }
        composable(ROUTE_PROFILE) {
            ProfileScreen(viewModel, navController)
        }

        composable(ROUTE_ABOUT) {
            About(viewModel, navController)
        }
        composable(ROUTE_ADDDATA) {
            About(viewModel, navController)
        }
    }
}


