package com.hasan.imseducation.screens

import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import com.hasan.imseducation.model.Subject
import com.hasan.imseducation.navigation.Screens

@Preview
@Composable
fun PreviewTest() {
    Test(navController = rememberNavController())
}

@Composable
fun Test(navController: NavController) {
    val backDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
    Scaffold(bottomBar = {
        BottomNavigationComponent(navController)
    })

    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {

                Spacer(modifier = Modifier.width(80.dp))
                Text(text = "Test", fontSize = 26.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(80.dp))

            }
            Text(text = "O'z ustingizda ishlang", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(18.dp))
            LazyColumn {
                items(Subject.getAllSubjects()){
                    Button(
                        onClick = {navController.navigate("TestFun/${Subject.getSubjectId(it)}") },
                        colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
                    ) {
                        Text(text = it, fontSize = 18.sp)
                    }
                }
            }
        }
    }
}

@Composable
fun TestFun(navController: NavController, subjectId: Int) {
    val backDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = { backDispatcher?.onBackPressed() }) {
                Icon(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = "Ortga", tint = Color.Black
                )
            }
            Spacer(modifier = Modifier.width(40.dp))
            Text(text = Subject.getSubject(subjectId), fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(40.dp))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.menu_svgrepo_com__2_),
                    contentDescription = "menyu", tint = Color.Black
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "1-daraja", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "2-daraja", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "3-daraja", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "4-daraja", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "5-daraja", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "6-daraja", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "7-daraja", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "8-daraja", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "9-daraja", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "10-daraja", fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "11-daraja", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue), modifier = Modifier.width(300.dp)
        ) {
            Text(text = "12-daraja", fontSize = 18.sp)
        }


    }
}