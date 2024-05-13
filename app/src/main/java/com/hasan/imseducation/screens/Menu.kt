package com.hasan.imseducation.screens

import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hasan.imseducation.ui.theme.blueC

@Composable
fun Menu(navController: NavController) {
    val backDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(12.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {

            Spacer(modifier = Modifier.width(80.dp))
            Text(text = "Matematika", fontSize = 26.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(80.dp))

        }
        Text(text = "O'z ustingizda ishlang", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(18.dp))
        LazyColumn {
            items(com.hasan.imseducation.model.Menu.getAllMenu()) {
                Button(
                    onClick = { navController.navigate("Menu/${com.hasan.imseducation.model.Menu.getMenuId(it)}") },
                    colors = ButtonDefaults.buttonColors(blueC),
                    modifier = Modifier.width(300.dp)
                ) {
                    Text(text = it, fontSize = 18.sp)
                }
            }
        }
    }
}


