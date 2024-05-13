package com.hasan.imseducation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.hasan.imseducation.screens.Chat
import com.hasan.imseducation.screens.ChatScreen
import com.hasan.imseducation.screens.HomeScreen
import com.hasan.imseducation.screens.LoginScreen
import com.hasan.imseducation.screens.Menu
import com.hasan.imseducation.screens.Profile
import com.hasan.imseducation.screens.Saved
import com.hasan.imseducation.screens.SignUp
import com.hasan.imseducation.screens.SplashScreen
import com.hasan.imseducation.screens.Test
import com.hasan.imseducation.screens.TestFun
import com.hasan.imseducation.screens.TestQues

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
        composable(route = Screens.ChatScreen.route){
           ChatScreen(navController)
        }
        composable(route = Screens.TestFun.route, arguments = listOf(
            navArgument("id"){
                type = NavType.IntType
            }
        )){
            val id = it.arguments?.getInt("id")!!
         TestFun(navController, id)
        }
        composable(route = Screens.TestQues.route, arguments = listOf(navArgument("id"){
            type= NavType.IntType
        })){
            val id =it.arguments?.getInt("id")!!
           TestQues(navController,id)
        }
        composable(route = Screens.Menu.route){
            Menu(navController)
        }
        composable(route = Screens.Login.route){
            LoginScreen(navController)
        }
        composable(route = Screens.SignUp.route){
           SignUp(navController)
        }
    }
}