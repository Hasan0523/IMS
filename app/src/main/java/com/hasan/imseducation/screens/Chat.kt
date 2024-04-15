package com.hasan.imseducation.screens

import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import com.hasan.imseducation.model.Message
import com.hasan.imseducation.model.User
import com.hasan.imseducation.ui.theme.Background
import com.hasan.imseducation.ui.theme.BlueLight
import com.hasan.imseducation.ui.theme.Gray
import com.hasan.imseducation.ui.theme.blue1

@Preview
@Composable
fun previewChat() {
    Chat(navController = rememberNavController())
}

@Composable
fun Chat(navController: NavController) {

    val context = LocalContext.current
    val chats = remember { mutableStateListOf<User>() }
    val users = remember { mutableStateListOf<User>() }
    val search = remember { mutableStateOf("") }

    Scaffold(bottomBar = {
        BottomNavigationComponent(navController)
    }) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .background(Color.White)
                .verticalScroll(rememberScrollState())
        ) {
            TopBar(search, navController)
            Chats(navController = navController, chats = chats)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(search: MutableState<String>, navController: NavController) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp, top = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .clickable { }


        )

        TextField(
            modifier = Modifier
                .padding(10.dp)
                .weight(1f),
            shape = RoundedCornerShape(20.dp),
            value = search.value,
            onValueChange = { search.value = it },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = blue1,
                unfocusedTextColor = Color.Transparent,
                focusedTextColor = Color.Transparent
            )
        )
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .clickable { })

    }

}

@Composable
fun LazyItem(index: Int, chat: User, navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp)
            .clickable { }, verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
        )
        Column(
            verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start,
            modifier = Modifier.weight(1f)
        ) {

        }

    }
}

@Composable
fun Chats(navController: NavController, chats: SnapshotStateList<User>) {
    LazyColumn(
        Modifier
            .background(Color.White, RoundedCornerShape(16.dp))
    ) {
        items(chats.size) {
            LazyItem(it, chats[it], navController)
        }
    }
}


