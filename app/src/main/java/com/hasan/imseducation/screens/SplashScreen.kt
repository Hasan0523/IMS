package com.hasan.imseducation.screens

import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hasan.imseducation.R
import com.hasan.imseducation.model.Pager
import com.hasan.imseducation.navigation.Screens
import com.hasan.imseducation.ui.theme.Brown
import com.hasan.imseducation.ui.theme.Purple40
import com.hasan.imseducation.ui.theme.bg


//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//fun ASplashScreen(navController: NavController) {
//    val pagerState = rememberPagerState(pageCount = {
//    10
//})
//    val normal = FontFamily(Font(R.font.montserratbold))
//    val bold = FontFamily(Font(R.font.montserratbolditalic))
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .verticalScroll(rememberScrollState())
//            .background(bg),
//        horizontalAlignment = Alignment.CenterHorizontally,
//
//    ) {
////        Text(modifier = Modifier.padding(top = 25.dp), fontSize = 30.sp,fontFamily =bold,text = "Welcome to the", color = textColor )
////        Text(modifier = Modifier.padding(top = 2.dp, bottom = 15.dp), fontSize = 30.sp,fontFamily =bold,text = "IMS Education", color = textColor )
//
//    }
//}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SplashScreen(navController: NavController) {
    val normal = FontFamily(Font(R.font.montserratbold))
    val inriasans = FontFamily(Font(R.font.inriasansregular))
    val monreg = FontFamily(Font(R.font.monserratregular))
    val monlight = FontFamily((Font(R.font.monserratlight)))
    val list = listOf(
        Pager(

            "IMS Educationga", "hush kelibsiz",
            R.drawable.pager11,
            R.drawable.pager12,
            "Bu yerda siz aniq fanlar," + "\nzamonaviy kasblarni va tillarni" + "\nonlayn o’rganishingiz mumkin."
        ), Pager(

            "IMS Educationga", "hush kelibsiz",
            R.drawable.pager21,
            R.drawable.pager22,
            "Bu platforma bir paytda o’quvchilar va o’qituvchilar foydalanishi uchun. ",
        ), Pager(

            "IMS Educationga", "hush kelibsiz",
            R.drawable.pager31,
            R.drawable.pager32,
            "O’rgangan bilimlaringizni sinab ko’rishingiz mumkin. IMS educationda barcha darslar bepul"
        )
    )
    val pagerState = rememberPagerState(pageCount = {
        3
    })
    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(state = pagerState) { index ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .background(bg),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                )
                Text(
                    text = list[index].gtext,
                    fontSize = 32.sp,
                    fontFamily = inriasans,
                    color = Brown
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = list[index].gtext2,
                    fontSize = 32.sp,
                    fontFamily = inriasans,
                    color = Brown
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                )
                Column(Modifier.fillMaxWidth()) {
                    Image(
                        painter = painterResource(id = list[index].img),
                        contentDescription = "isasjds",
                        modifier = Modifier
                            .height(190.dp),
                        contentScale = ContentScale.FillHeight
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Image(
                        painter = painterResource(id = list[index].img2),
                        contentDescription = "sd",
                        Modifier
                            .align(Alignment.End)
                            .height(190.dp),
                        contentScale = ContentScale.FillHeight
                    )

                }
                Spacer(modifier = Modifier.height(25.dp))
                Text(
                    text = list[index].information,
                    fontSize = 22.sp,
                    fontFamily = monreg,
                    color = Brown,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(10.dp))
                if (index == 2) {
                    Button(modifier = Modifier.width(200.dp),onClick = { navController.navigate(Screens.Home.route)}, colors = ButtonDefaults.buttonColors(containerColor = Purple40), shape = RoundedCornerShape(10.dp)) {
                        Text(text = "Kirish", fontFamily = normal, fontSize = 22.sp, color = Color.White)
                    }
                }
                Spacer(modifier = Modifier.height(35.dp))
                Row(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()

                        .padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(pagerState.pageCount) { iteration ->
                        val color =
                            if (pagerState.currentPage == iteration) Brown else Color.LightGray
                        Box(
                            modifier = Modifier
                                .padding(2.dp)
                                .clip(CircleShape)
                                .background(color)
                                .size(16.dp)
                        )
                    }
                }


            }
        }
    }
}