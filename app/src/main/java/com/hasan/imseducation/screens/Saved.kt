package com.hasan.imseducation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun previewSaved (){
    Saved(navController = rememberNavController())
}
@Composable
fun Saved(navController: NavController){
    Scaffold(bottomBar = {
        BottomNavigationComponent(navController)
    }) {
        Column (modifier = Modifier.padding(it)) {
            Text(text = "saved")
        }
    }
}