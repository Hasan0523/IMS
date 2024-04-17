package com.hasan.imseducation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.screens.Chat
import com.hasan.imseducation.screens.HomeScreen
import com.hasan.imseducation.screens.Profile
import com.hasan.imseducation.screens.Saved
import com.hasan.imseducation.screens.SplashScreen
import com.hasan.imseducation.screens.Test

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
        composable(route = Screens.SplashScreen.route){
         SplashScreen(navController)
        }
        composable(route = Screens.Chat.route){
            Chat(navController)
        }
        composable(route = Screens.Saved.route){
           Saved(navController)
        }
        composable(route = Screens.Test.route){
            Test(navController)
        }
        composable(route = Screens.Profile.route){
            Profile(navController)
        }
    }
}