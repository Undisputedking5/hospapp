package com.example.hospitalmanagementsystem.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.hospitalmanagementsystem.ui.theme.screens.register.RegisterScreen
import androidx.navigation.compose.composable
import com.example.hospitalmanagementsystem.ui.theme.screens.login.LoginScreen
import com.example.hospitalmanagementsystem.ui.theme.screens.patient.AddPatientScreen
import com.example.tma.ui.theme.screens.dashboard.DashboardScreen

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController(),
               startDestination: String = ROUTE_ADD_PATIENT){
    NavHost(navController = navController,
        startDestination = startDestination) {
        composable(ROUTE_REGISTER){ RegisterScreen(navController) }
        composable(ROUTE_LOGIN) {LoginScreen(navController)}
        composable(ROUTE_DASHBOARD) { DashboardScreen(navController) }
        composable(ROUTE_ADD_PATIENT) { AddPatientScreen(navController)}

    }
}
