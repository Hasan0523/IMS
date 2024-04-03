package com.hasan.imseducation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.screens.HomeScreen

@Composable
fun NavGraph (){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route)
    {
        composable(route = Screens.Home.route){
            HomeScreen(navController)


       }
    }
}