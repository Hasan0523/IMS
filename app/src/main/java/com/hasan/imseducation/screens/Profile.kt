package com.hasan.imseducation.screens

import android.graphics.ColorMatrix
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import com.hasan.imseducation.ui.theme.Background
import com.hasan.imseducation.ui.theme.ButtonColor
import com.hasan.imseducation.ui.theme.Chiqish
import com.hasan.imseducation.ui.theme.Green
import com.hasan.imseducation.ui.theme.blueC

@Preview
@Composable
fun PreviewProfile() {
    Profile(navController = rememberNavController())
}

@Composable
fun Profile(navController: NavController) {
    Scaffold(bottomBar = {
        BottomNavigationComponent(navController)
    }) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(Color.White), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.logo),
                    contentDescription = "",
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .clickable { })
                Spacer(modifier = Modifier.width(30.dp))
                Image(painter = painterResource(id = R.drawable.img),
                    contentDescription = "",
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .clickable { })
                Spacer(modifier = Modifier.width(30.dp))
                Image(painter = painterResource(id = R.drawable.ibrat),
                    contentDescription = "",
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .clickable { })

            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Jahongir O'rozboyev", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Text(text = "@Jahongir",fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(blueC), modifier = Modifier.width(300.dp)) {
                Text(text = "Tahrirlash", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(6.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(blueC), modifier = Modifier.width(300.dp)) {
                Text(text = "Kurslar", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(6.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(blueC), modifier = Modifier.width(300.dp)) {
                Text(text = "Parol o'rnatish", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(6.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(blueC), modifier = Modifier.width(300.dp)) {
                Text(text = "Tilni almashtirish", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(6.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(blueC), modifier = Modifier.width(300.dp)) {
                Text(text = "Tungi rejimga o'tish", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(6.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(blueC), modifier = Modifier.width(300.dp)) {
                Text(text = "O'qtuvchi sifatida qo'shilish", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(6.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(blueC), modifier = Modifier.width(300.dp)) {
                Text(text = "Shikoyat va takliflar", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.height(6.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Chiqish), modifier = Modifier.width(300.dp)) {
                Text(text = "Ilovadan chiqish", fontSize = 18.sp)
            }


        }
    }
}