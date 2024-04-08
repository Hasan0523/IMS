package com.hasan.imseducation.screens

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.hasan.imseducation.R

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
)


@Composable
fun BottomNavigationComponent(navController: NavController) {
    val items = listOf(
        BottomNavigationItem(
            title = "Home",
            selectedIcon = R.drawable.home,
            unselectedIcon = R.drawable.home_1,
        ),
        BottomNavigationItem(
            title = "Chat",
            selectedIcon = R.drawable.telegram,
            unselectedIcon = R.drawable.telegram_1,
        ),
        BottomNavigationItem(
            title = "Saved",
            selectedIcon = R.drawable.bookmark_svgrepo_com,
            unselectedIcon = R.drawable.bookmark_svgrepo_com__1_,
        ),
        BottomNavigationItem(
            title = "Test",
            selectedIcon = R.drawable.stairs_1,
            unselectedIcon = R.drawable.stairs,
        ),
        BottomNavigationItem(
            title = "Profile",
            selectedIcon = R.drawable.user_1,
            unselectedIcon =R.drawable.user_2,
        ),
    )
    val currentRoute = navController.currentDestination?.route
    NavigationBar(containerColor = Color.White) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(selected = currentRoute == item.title, onClick = {
                navController.navigate(item.title)
            }, label = {
                Text(text = item.title, fontWeight = FontWeight.Bold )
            }, icon = {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(if (currentRoute == item.title) {
                        item.selectedIcon
                    } else item.unselectedIcon),
                    contentDescription = item.title,
                    tint = Color.Black,
                )
            }, colors = NavigationBarItemDefaults.colors(indicatorColor = Color.Green))
        }
    }
}