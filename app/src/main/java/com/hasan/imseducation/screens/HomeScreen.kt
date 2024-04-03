package com.hasan.imseducation.screens

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import com.hasan.imseducation.navigation.Screens
import com.hasan.imseducation.ui.theme.blue


@Preview
@Composable
fun PreviewHome() {
   HomeScreen(navController = rememberNavController())
}
@Composable
fun HomeScreen(navController: NavController){
 Column (
     Modifier
         .fillMaxSize()
         .background(Color.White)){

           Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
               Image(
                   painter = painterResource(id = R.drawable.img_1),
                   contentDescription = "",
                   contentScale = ContentScale.Crop,
                   modifier = Modifier
                       .padding(vertical = 22.dp, horizontal = 12.dp)
                       .size(60.dp)
                       .clip(CircleShape)
                       .clickable { }
               )
               SearchBar()
               IconButton(onClick = { /*TODO*/ }) {
                   Image(painter = painterResource(id = R.drawable.img_1), contentDescription = "")
               }
           }

   }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {
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
            .width(327.dp),
        leadingIcon = {
            Icon(
                modifier = Modifier.size(30.dp), imageVector = Icons.Default.Search, contentDescription = "Search Icon", tint = Black
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
