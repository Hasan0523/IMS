package com.hasan.imseducation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R

@Preview
@Composable
fun previewProfile (){
   Profile(navController = rememberNavController())
}
@Composable
fun Profile(navController: NavController){
   Scaffold(bottomBar = {
      BottomNavigationComponent(navController)
   }) {
      Column (modifier = Modifier
         .padding(it)
         .fillMaxSize()
         .background(Color.White)) {
        Row {
           Image(painter = painterResource(id = R.drawable.logo),
              contentDescription = "",
              contentScale = ContentScale.FillHeight,
              modifier = Modifier
                 .size(70.dp)
                 .clip(CircleShape)
                 .clickable { })

           Image(painter = painterResource(id = R.drawable.logo),
              contentDescription = "",
              contentScale = ContentScale.FillHeight,
              modifier = Modifier
                 .size(70.dp)
                 .clip(CircleShape)
                 .clickable { })
           Image(painter = painterResource(id = R.drawable.logo),
              contentDescription = "",
              contentScale = ContentScale.FillHeight,
              modifier = Modifier
                 .size(70.dp)
                 .clip(CircleShape)
                 .clickable { })

        }


      }
   }
}