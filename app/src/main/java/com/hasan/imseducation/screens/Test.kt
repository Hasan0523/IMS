package com.hasan.imseducation.screens

import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import com.hasan.imseducation.model.Ques
import com.hasan.imseducation.model.Subject
import com.hasan.imseducation.model.Test
import com.hasan.imseducation.ui.theme.Background
import com.hasan.imseducation.ui.theme.Green
import com.hasan.imseducation.ui.theme.OptionBg
import com.hasan.imseducation.ui.theme.blueC

@Preview
@Composable
fun PreviewTest() {
    TestQues(navController = rememberNavController(), 2)
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
                items(Subject.getAllSubjects()) {
                    Button(
                        onClick = { navController.navigate("TestFun/${Subject.getSubjectId(it)}") },
                        colors = ButtonDefaults.buttonColors(blueC),
                        modifier = Modifier.width(300.dp)
                    ) {
                        Text(text = it, fontSize = 18.sp)
                    }
                }
            }
        }
    }
}

@Composable
fun TestFun(navController: NavController, quesId: Int) {
    val backDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
    Column(
        modifier = Modifier
            .fillMaxSize()
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
            Text(
                text = Ques.getQues(quesId),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.width(40.dp))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.menu_svgrepo_com__2_),
                    contentDescription = "menyu", tint = Color.Black
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(Ques.getAllQues()) {
                Button(
                    onClick = { navController.navigate("TestQues/${Ques.getQuesId(it)}") },
                    colors = ButtonDefaults.buttonColors(blueC),
                    modifier = Modifier.width(300.dp)
                ) {
                    Text(text = it, fontSize = 18.sp)
                }
            }
        }

    }
}

@Composable
fun TestQues(navController: NavController, quesid: Int) {
    val test = Test(
        "Fizikani birinchi bo'lib harbiy sohada qo'llagan inson qayerlik bo'lgan",
        listOf("Amerika", "Germaniya", "Rim", "Sitsilya"),
        "to'g'ri"
    )
    val testNumber = remember { mutableStateOf(1) }
    val backDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
    Box {
        Column(
            modifier = Modifier.background(Color.Black)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = {backDispatcher?.onBackPressed()}) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = "Ortga",
                        tint = Color.White,
                        modifier = Modifier.size(35.dp)
                    )
                }
                Spacer(modifier = Modifier.width(60.dp))
                Text(text = "1-daraja", fontSize = 34.sp, color = Color.White)
                Spacer(modifier = Modifier.width(60.dp))
                IconButton(onClick = {  }) {
                    Icon(
                        painter = painterResource(id = R.drawable.menu_vertical),
                        contentDescription = "menu",
                        tint = Color.White,
                        modifier = Modifier.size(35.dp)
                    )
                }
            }
            val progress = 0.05f

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "1",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Green
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(text = "/", fontSize = 24.sp, color = Color.White)
                Spacer(modifier = Modifier.width(2.dp))
                Text(text = "20", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)
                Spacer(modifier = Modifier.width(10.dp))
                LinearProgressIndicator(
                    modifier = Modifier
                        .weight(1f)
                        .height(10.dp),
                    color = Green,
                    progress = progress,
                    trackColor = OptionBg,
                    strokeCap = StrokeCap.Round
                )
                Spacer(modifier = Modifier.width(0.dp))
                IconButton(onClick = {  }) {
                    Icon(
                        painter = painterResource(id = R.drawable.time_icon),
                        contentDescription = "time",
                        tint = Color.Green,
                        modifier = Modifier.size(30.dp)
                    )
                }
                Spacer(modifier = Modifier.width(0.dp))
                Text(text = "10:00", fontSize = 22.sp, color = Color.White)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = testNumber.value.toString(),
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = " - masala", fontSize = 26.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
            Text(
                text = test.question,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {

                items(test.vars) {

                    Button(
                        onClick = { testNumber.value++ },
                        colors = ButtonDefaults.buttonColors(blueC), modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp, end = 30.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = it, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                        }
                    }
                }
            }
        }
    }

}


