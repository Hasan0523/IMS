package com.hasan.imseducation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import com.hasan.imseducation.model.Book
import com.hasan.imseducation.model.OnlineLesson
import com.hasan.imseducation.model.Teacher
import com.hasan.imseducation.model.Video
import com.hasan.imseducation.model.app
import com.hasan.imseducation.navigation.Screens
import com.hasan.imseducation.ui.theme.Homebac
import com.hasan.imseducation.ui.theme.bcolor
import com.hasan.imseducation.ui.theme.blue
import com.hasan.imseducation.ui.theme.blue1
import com.hasan.imseducation.ui.theme.blue2


@Preview
@Composable
fun PreviewHome() {
    HomeScreen(navController = rememberNavController())
}

@Composable
fun HomeScreen(navController: NavController) {
    val topTeachers = listOf(
        Teacher("Hasan", "Bo'ronov", "",),
        Teacher("Muhammadqodir", "Rustamov", ""),
        Teacher("Hasan", "Bo'ronov", ""),
        Teacher("Hasan", "Bo'ronov", ""),
        Teacher("Hasan", "Bo'ronov", ""),
        Teacher("Hasan", "Bo'ronov", ""),
        Teacher("Hasan", "Bo'ronov", ""),
        Teacher("Hasan", "Bo'ronov", ""),
    )
    val otherapps= listOf(
        app("I.Farzandlari","") ,
        app("I.Farzandlari","") ,
        app("I.Farzandlari",""),
        app("I.Farzandlari","") ,
        app("I.Farzandlari",""),
        app("I.Farzandlari","")
    )
    val Book= listOf(
        Book("7-sinf Matematika","10",5.0,1232232,"",""),
        Book("7-sinf Matematika","10",5.0,1232232,"",""),
        Book("7-sinf Matematika","10",5.0,1232232,"",""),
        Book("7-sinf Matematika","10",5.0,1232232,"",""),
        Book("7-sinf Matematika","10",5.0,1232232,"",""),
        Book("7-sinf Matematika","10",5.0,1232232,"",""),
        Book("7-sinf Matematika","10",5.0,1232232,"",""),
        Book("7-sinf Matematika","10",5.0,1232232,"",""))
    val Video= listOf(
        Video("6-sinf Matematika","18",5.0,12322,"",""),
        Video("5-sinf Matematika","18",5.0,12322,"",""),
        Video("7-sinf Matematika","18",5.0,12322,"",""),
        Video("8-sinf Matematika","18",5.0,12322,"",""),
        Video("9-sinf Matematika","18",5.0,12322,"",""),
        Video("10-sinf Matematika","18",5.0,12322,"",""),
        Video("11-sinf Matematika","18",5.0,12322,"",""),
        Video("Tengsizlik","18",5.0,12322,"",""))
    val OnlineLesson= listOf(
        OnlineLesson("Tengsizliklar","15",1222,"",""),
        OnlineLesson("Olimpiadaga tayyorgarlik","15",1222,"",""),
        OnlineLesson("Geometriya","15",1222,"",""),
        OnlineLesson("Sonlar nazariyasi","15",1222,"",""),
        OnlineLesson("Butun sonlar","16",1222,"",""),
    )
    Scaffold(bottomBar = {
        BottomNavigationComponent(navController)
    }) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(it)
                .background(Homebac)
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(8.dp))
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "",
                    modifier = Modifier
                        //.padding(vertical = 22.dp, horizontal = 12.dp)
                        .size(60.dp)
                        .clip(CircleShape)
                        .clickable { },
                    contentScale = ContentScale.Crop
                )
                SearchBar()
                IconButton(onClick = { navController.navigate(Screens.Menu.route) }) {
                    Icon(
                        painter = painterResource(id = R.drawable.menu_svgrepo_com__2_),
                        contentDescription = "",
                        Modifier.size(40.dp),
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
            }
            Row {
                Spacer(modifier = Modifier.width(12.dp))
                Text(text = "Boshqa ilovalar", fontSize = 20.sp)
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Homebac,
                )
            ) {
                LazyRow {
                    items(otherapps) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Spacer(modifier = Modifier.height(8.dp))
                            Image(
                                painter = painterResource(id = R.drawable.ibrat),
                                contentDescription = "",
                                Modifier
                                    .padding(horizontal = 16.dp)
                                    .size(70.dp)
                                    .clip(
                                        CircleShape
                                    ),
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(text = it.name, fontSize = 16.sp)
                            Spacer(modifier = Modifier.height(4.dp))

                        }
                    }
                }

            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "To'p o'qtuvchilar",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            LazyRow {
                items(topTeachers) {
                    Spacer(modifier = Modifier.width(24.dp))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {

                        Image(
                            painter = painterResource(id = R.drawable.img),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(vertical = 22.dp, horizontal = 8.dp)
                                .size(80.dp)
                                .clip(CircleShape)
                                .clickable { },
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = it.firstName.first() + "." + it.lastName,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Kitoblar",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                )
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = White
                )
            ) {
                LazyRow {
                    items(Book) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(22.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = blue1
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_2),
                                contentDescription = "", modifier = Modifier
                                    //.padding(vertical = 22.dp, horizontal = 12.dp)
                                    .height(110.dp)
                                    .width(140.dp)
                                    .clip(RoundedCornerShape(percent = 14))
                                    .clickable { },
                                contentScale = ContentScale.Crop
                            )
                        }

                        Column(verticalArrangement = Arrangement.Center) {
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(text = it.name, fontSize = 22.sp)
                            Spacer(modifier = Modifier.height(6.dp))
                            Row(verticalAlignment = Alignment.Bottom) {
                                Text(
                                    text = it.price + "$",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {

                                Icon(
                                    painter = painterResource(id = R.drawable.star_icon),
                                    contentDescription = "", tint = Color.Yellow,
                                    modifier = Modifier.size(24.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = it.rating.toString(),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Icon(
                                    painter = painterResource(id = R.drawable.bookmark_svgrepo_com),
                                    contentDescription = "", tint = bcolor,
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier = Modifier.width(2.dp))
                                Text(
                                    text = it.enrollment.toString(),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(16.dp))
                                Icon(
                                    painter = painterResource(id = R.drawable.bookmark_svgrepo_com__1_),
                                    contentDescription = "",
                                    tint = Black,
                                    modifier = Modifier.size(32.dp)
                                )

                            }

                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Video darslar",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                )
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = White
                )
            ) {
                LazyRow {
                    items(Video) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(22.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = blue1
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.video_darslar),
                                contentDescription = "", modifier = Modifier
                                    //.padding(vertical = 22.dp, horizontal = 12.dp)
                                    .height(110.dp)
                                    .width(140.dp)
                                    .clip(RoundedCornerShape(percent = 14))
                                    .clickable { },
                                contentScale = ContentScale.Crop
                            )
                        }

                        Column(verticalArrangement = Arrangement.Center) {
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(text = it.name, fontSize = 22.sp)
                            Spacer(modifier = Modifier.height(6.dp))
                            Row(verticalAlignment = Alignment.Bottom) {
                                Text(
                                    text = it.price + "$",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    painter = painterResource(id = R.drawable.star_icon),
                                    contentDescription = "", tint = Color.Yellow,
                                    modifier = Modifier.size(24.dp)
                                )

                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = it.rating.toString(),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Icon(
                                    painter = painterResource(id = R.drawable.bookmark_svgrepo_com),
                                    contentDescription = "", tint = bcolor,
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier = Modifier.width(2.dp))
                                Text(
                                    text = it.enrollment.toString(),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(16.dp))
                                Icon(
                                    painter = painterResource(id = R.drawable.bookmark_svgrepo_com__1_),
                                    contentDescription = "", tint = Black,
                                    modifier = Modifier.size(32.dp)
                                )

                            }

                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Onlayn darslar",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic
                )
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = White
                )
            ) {
                LazyRow {
                    items(OnlineLesson) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(22.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = blue1
                            )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.video_darslar),
                                contentDescription = "", modifier = Modifier
                                    //.padding(vertical = 22.dp, horizontal = 12.dp)
                                    .height(110.dp)
                                    .width(140.dp)
                                    .clip(RoundedCornerShape(percent = 14))
                                    .clickable { },
                                contentScale = ContentScale.Crop
                            )
                        }

                        Column(verticalArrangement = Arrangement.Center) {
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(text = it.name, fontSize = 22.sp)
                            Spacer(modifier = Modifier.height(6.dp))
                            Row(verticalAlignment = Alignment.Bottom) {
                                Text(
                                    text = it.price + "$",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {




                                Icon(
                                    painter = painterResource(id = R.drawable.bookmark_svgrepo_com),
                                    contentDescription = "", tint = bcolor,
                                    modifier = Modifier.size(20.dp)
                                )
                                Spacer(modifier = Modifier.width(2.dp))
                                Text(
                                    text = it.enrollment.toString(),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(16.dp))
                                Icon(
                                    painter = painterResource(id = R.drawable.bookmark_svgrepo_com__1_),
                                    contentDescription = "", tint = Black,
                                    modifier = Modifier.size(32.dp)
                                )

                            }

                        }
                    }
                }
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun RowScope.SearchBar() {
    var query by remember { mutableStateOf("") }
    var isSearchActive by remember { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current

    OutlinedTextField(
        value = query,
        onValueChange = {
            query = it
        },
        modifier = Modifier
            .padding(16.dp)
            .weight(1f),
        leadingIcon = {
            Icon(
                modifier = Modifier.size(30.dp),
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Black
            )
        },
        trailingIcon = {
            if (isSearchActive) {
                IconButton(onClick = {
                    query = ""
                    isSearchActive = false
                    keyboardController?.hide()
                }) {
                    Icon(imageVector = Icons.Default.Clear, contentDescription = "Clear Icon")
                }
            }
        },
        placeholder = { Text(text = "Qidirish") },
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Search
        ),
        keyboardActions = KeyboardActions(onSearch = {
            // Handle search action here
            keyboardController?.hide()
        }),
        textStyle = TextStyle(color = Color.Black, fontSize = 15.sp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = White,
            unfocusedBorderColor = White,
            containerColor = blue,

            ),
        singleLine = true,
        shape = RoundedCornerShape(15.dp),
    )
}
