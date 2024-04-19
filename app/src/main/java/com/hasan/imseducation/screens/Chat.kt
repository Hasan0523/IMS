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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.ArrowBack
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import com.hasan.imseducation.api.SharedHelper
import com.hasan.imseducation.model.Message
import com.hasan.imseducation.model.User
import com.hasan.imseducation.navigation.Screens
import com.hasan.imseducation.ui.theme.Background
import com.hasan.imseducation.ui.theme.BlueLight
import com.hasan.imseducation.ui.theme.Gray
import com.hasan.imseducation.ui.theme.blue
import com.hasan.imseducation.ui.theme.blue1

@Preview
@Composable
fun PreviewChat() {
    Chat(navController = rememberNavController())
}

@Composable
fun Chat(navController: NavController) {

    LocalContext.current
    val chats = remember {
        mutableStateListOf<User>(
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
            User("Hasan", "12345678", "Hasan", "Bo'ronov", "asdasdsad", "1234"),
        )
    }
    remember { mutableStateListOf<User>() }
    val search = remember { mutableStateOf("") }

    Scaffold(bottomBar = {
        BottomNavigationComponent(navController)
    })
    {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth()
                .background(Color.White)
        ) {
            TopBar(search, navController)
            Chats(navController = navController, chats = chats)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun TopBar(search: MutableState<String>, navController: NavController) {

    var query by remember { mutableStateOf("") }
    var isSearchActive by remember { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current
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
                .size(70.dp)
                .clip(CircleShape)
                .clickable { }


        )

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
                    tint = Color.Black
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
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White,
                containerColor = blue,

                ),
            singleLine = true,
            shape = RoundedCornerShape(15.dp),
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
fun LazyItem(index: Int, user: User, navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp)
            .clickable { navController.navigate(Screens.ChatScreen.route) }, verticalAlignment = Alignment.CenterVertically
    ) {


            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .padding(8.dp)
                    .size(60.dp)
                    .clip(CircleShape)
            )
        Column(
            verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = user.firstName + " " + user.lastName,
                textAlign = TextAlign.Center,
                color = Color.Black
            )
            Text(
                text = user.username!!,
                textAlign = TextAlign.Center,
                color = Color.Gray,
                fontSize = 12.sp
            )
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

@Composable
fun ChatScreen(navController: NavController) {
    val user = remember { mutableStateOf(User("", "", "", "", "", "")) }
    val messages = remember { mutableStateListOf<Message>() }
    val context = LocalContext.current

    Column(modifier = Modifier.background(Background)) {
        ChatTopBar(user)
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally

        ) {
            items(messages.size) { index ->
                MessageItem(messages[index], index)
            }
        }

        if (user.value.firstName!!.isNotEmpty()) EnterMessage(userKey = user.value.key!!)

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MessageItem(
    message: Message,
//    deleteDialogOpen: MutableState<Boolean>,
//    deleteIndex: MutableState<Int>,
    index: Int
) {
    val currentUserKey = SharedHelper.SharedHelper.getInstance(LocalContext.current).getKey()
    val fromMe = message.from == currentUserKey
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        if (fromMe) Spacer(modifier = Modifier.width(100.dp))
        Card(
            modifier = Modifier
                .padding(12.dp)
                .combinedClickable(
                    onClick = {

                    },
//                    onLongClick = {
//                        deleteDialogOpen.value = true
//                        deleteIndex.value = index
//                    }
                ),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(if (fromMe) blue1 else Gray)
        ) {
            Text(
                text = message.text!!,
                color = Color.White,
                modifier = Modifier.padding(12.dp),
                textAlign = if (fromMe) TextAlign.End else TextAlign.Start
            )
        }
        if (!fromMe) Spacer(modifier = Modifier.width(100.dp))
    }
}

@Composable
fun ChatTopBar(user: MutableState<User>) {
    val backDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher

    Row(
        modifier = Modifier.padding(12.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        IconButton(onClick = { backDispatcher?.onBackPressed() }) {
            Icon(Icons.Rounded.ArrowBack, "", Modifier.size(40.dp))
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = user.value.firstName + " " + user.value.lastName,
                textAlign = TextAlign.Center,
                color = Color.Black
            )
            Text(
                text = user.value.username!!,
                textAlign = TextAlign.Center,
                color = Color.Gray,
                fontSize = 12.sp
            )
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnterMessage(
    userKey: String
) {
    val context = LocalContext.current
    val message = remember {
        mutableStateOf("")
    }
    val focusManager = LocalFocusManager.current
    val focusRequester = remember { FocusRequester() }
    OutlinedTextField(
        value = message.value,
        onValueChange = { message.value = it },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .focusRequester(focusRequester),
        shape = RoundedCornerShape(24.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            Color.Black,
            containerColor = Color.White,
            focusedBorderColor = blue1,
            unfocusedBorderColor = Color.Transparent
        ),
        trailingIcon = {
            IconButton(
                onClick = {},
                enabled = message.value.isNotEmpty(),
            ) {
                Icon(
                    Icons.Rounded.Send,
                    contentDescription = "",
                    tint = if (message.value.isNotEmpty()) blue1 else Color.Gray
                )
            }
        },
        maxLines = 3,
        placeholder = {
            Text(
                text = "Write a message", color = Color.Gray
            )
        }

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChangePasswordScreen() {
    val backDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
    val password = remember {
        mutableStateOf("")
    }
    val passwordOld = remember {
        mutableStateOf("")
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            IconButton(onClick = { backDispatcher?.onBackPressed() }) {
                Icon(Icons.Rounded.ArrowBack, contentDescription = "")
            }
        }
        TextField(modifier = Modifier.padding(12.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(android.graphics.Color.parseColor("#ECFEFF")),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            value = passwordOld.value,
            shape = RoundedCornerShape(16.dp),
            onValueChange = { passwordOld.value = it.trim() },
            label = { Text("Eski parol") })
        TextField(modifier = Modifier.padding(12.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(android.graphics.Color.parseColor("#ECFEFF")),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            value = password.value,
            shape = RoundedCornerShape(16.dp),
            onValueChange = { password.value = it.trim() },
            label = { Text("Yangi parol") })
        val context = LocalContext.current
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Green),
            enabled = password.value.isNotEmpty() && passwordOld.value.isNotEmpty()
        ) {
            Text(text = "Saqlash", color = Color.White)
        }
    }
}

