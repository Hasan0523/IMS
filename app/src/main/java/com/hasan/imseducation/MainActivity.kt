package com.hasan.imseducation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hasan.imseducation.navigation.NavGraph
import com.hasan.imseducation.ui.theme.IMSEducationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMSEducationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                 NavGraph()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IMSEducationTheme {
        Greeting("Android")
    }
}
/*IMS Education asosiy vazifasi tillarni va tabii fanlar shuningdek Matematikani o'rganish
* Bunda test bo'limi bo'lib bola o'z bilimini sinab ko'rishi mumkin bo'ladi va shunga ko'ra daraja berilib ims educationga o'qishga yoki ishga olinishi mumkin bo'kladi
* ims education ikki turda olimpiada va Dtm turida ta'lim beriladi
* yana boshq hususiyatidan ikkisi mavjud bo'ladi yani bular nazariy va amaliga bo'linadi
* Bu ilovani ikki xil insonlar ishlatishi mumkin bo'ladi
* 1. O'qtuvchilar bo'lib ular video yoki kitob yoki masala yuklashi mumkin bo'ladi
* 2. o'quvchi bo'lib ular video kitob yuklab olishi shuningdek test ishlashi va hamkorlikda o'qishi mumkin (Chat orqali)
* O'quvchilarning imkoniyatlaridan yana biri etiroz va hatolarni to'g'irlashi mumkin
* ilovada ims educationning maxsus kanali bo'lib bu kanal orqali ims educationga o'qtuvchi , o'quvchi olish shuningdek olimpiadalar o'tkazish mumkin bo'ladi
* Ilovani ustun taraflari
* 1.O'qtuvchilar video qo'yishi mumkin
* 2.O'qtuvchilar kitob qo'yishi mumkin
* 3.O'qtuvchilar test joylashi mumkin
* 4.Onlayn darslar uyishtirish mumkin
* 5.O'qtuvchilar va o'quvchilar birga ishlash mumkin (chat orqali)
* 6.Onlayn olimpiada o'tkazish mumkin
* 7.Mustaqil ishlash mumkin
* */
