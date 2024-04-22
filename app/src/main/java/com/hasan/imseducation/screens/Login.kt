package com.hasan.imseducation.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import com.hasan.imseducation.navigation.Screens
import com.hasan.imseducation.ui.theme.Brown
import com.hasan.imseducation.ui.theme.ButtonColor
import com.hasan.imseducation.ui.theme.Placeholder
import com.hasan.imseducation.ui.theme.TextF
import com.hasan.imseducation.ui.theme.bg
import com.hasan.imseducation.ui.theme.textColor


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    val context = LocalContext.current
    val Username = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val normal = FontFamily(Font(R.font.montserratbold))
    val inriasans = FontFamily(Font(R.font.inriasansregular))
    val monreg = FontFamily(Font(R.font.monserratregular))
    val monlight = FontFamily((Font(R.font.monserratlight)))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(bg),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .height(200.dp)
                .width(190.dp)
        )
        Text(
            text = "IMS education",
            fontSize = 30.sp,
            fontFamily = inriasans,
            color = Black,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(0.dp))
        Text(
            text = " Kirish",
            fontSize = 30.sp,
            fontFamily = inriasans,
            color = Black,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(25.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Username yoki google akkauntingizni kiriting:",
                fontFamily = inriasans,
                fontSize = 14.sp,
                color = Black
            )
            Spacer(modifier = Modifier.height(3.dp))
            TextField(
                modifier = Modifier.fillMaxWidth(),
                value = Username.value,
                onValueChange = { Username.value = it },
                maxLines = 1,
                placeholder = {
                    Text(
                        text = "xivilbek or @egamovmustafo333 or etc",
                        fontFamily = inriasans,
                        color = Placeholder
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = TextF,

                    ),
                shape = RoundedCornerShape(3.dp),
//                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Parolingizni kiriting:",
                fontFamily = inriasans,
                fontSize = 14.sp,
                color = Black
            )
            Spacer(modifier = Modifier.height(3.dp))
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = password.value,
                onValueChange = { password.value = it },
                maxLines = 1,
                placeholder = {
                    Text(
                        text = "Parolingizni kiriting",
                        fontFamily = inriasans,
                        color = Placeholder
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = TextF,

                    ),
                shape = RoundedCornerShape(3.dp),

                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Demo_DropDownMenu()
            Spacer(modifier = Modifier.height(35.dp))

        }
        Button(
            onClick = {
                if (Username.value.isEmpty() || password.value.length < 7
                ) {
                    Toast.makeText(context, "So'rovlarni to'gri to'ldiring", Toast.LENGTH_SHORT)
                        .show()
                    return@Button
                } else {
                    Toast.makeText(context, "Muvaffaqiyatli kirildi", Toast.LENGTH_SHORT).show()
                    navController.navigate(Screens.Home.route) {
                        popUpTo(navController.graph.id) {
                            inclusive = true
                        }
                    }
                }
            }, modifier = Modifier
                .width(320.dp)
                .height(45.dp), colors = ButtonDefaults.buttonColors(containerColor = ButtonColor),
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(
                text = "Kirish", fontSize = 20.sp,
                modifier = Modifier
                    .padding(vertical = 0.dp)
                    .clickable {},
                fontFamily = inriasans,
                color = Black
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Siz IMS educationda yangimisiz?",
            fontSize = 18.sp,
            fontFamily = inriasans,
            color = Black,
            modifier = Modifier.clickable { navController.navigate(Screens.SignUp.route) })
        Text(
            text = "Ro'yhatdan o'tish.",
            fontSize = 18.sp,
            fontFamily = inriasans,
            color = textColor,
            modifier = Modifier.clickable { navController.navigate(Screens.SignUp.route) })
        Spacer(modifier = Modifier.height(25.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Demo_DropDownMenu() {
    val inriasans = FontFamily(Font(R.font.inriasansregular))
    val context = LocalContext.current
    var expanded by remember { mutableStateOf(false) }
    var lang by remember { mutableStateOf("English") }

    Box {

//        IconButton(onClick = { expanded = !expanded }) {
//            Icon(
//                imageVector = Icons.Default.MoreVert,
//                contentDescription = "More"
//            )
//        }
        Column {


            Text(
                text = "Tilni tanlang:", modifier = Modifier,
                fontFamily = inriasans,
                fontSize = 14.sp,
                color = Black
            )
            Spacer(modifier = Modifier.height(3.dp))
            Card(
                modifier = Modifier
                    .width(375.dp)
                    .height(56.dp),
                colors = CardDefaults.cardColors(containerColor = TextF),
                shape = RoundedCornerShape(3.dp),
                onClick = { expanded = !expanded }

            ) {
                Text(
                    text = lang, fontFamily = inriasans,
                    color = Black, modifier = Modifier.padding(16.dp)
                )
            }
            DropdownMenu(
                modifier = Modifier.fillMaxWidth(),
                expanded = expanded,

                onDismissRequest = { expanded = false }
            ) {
                val l1 = listOf("English", "Русский", "O'zbek")
                l1.forEach {
                    DropdownMenuItem(
                        text = { Text(it) },
                        onClick = {
                            lang = it
                            Toast.makeText(context, lang, Toast.LENGTH_SHORT).show()
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}