package com.example.basic.basic.material3

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import timber.log.Timber

private data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean = false,
    val badgeCount: Int? = null
)

@Composable
@Preview(showBackground = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
private fun BottomNavigation(modifier: Modifier = Modifier) {
    val listItem = listOf(
        BottomNavigationItem(
            title = "Home",
            selectedIcon = Icons.Filled.Home,
            unselectedIcon = Icons.Outlined.Home
        ),
        BottomNavigationItem(
            title = "Email",
            selectedIcon = Icons.Filled.Email,
            unselectedIcon = Icons.Outlined.Email,
            badgeCount = 10
        ),
        BottomNavigationItem(
            title = "Settings",
            selectedIcon = Icons.Filled.Settings,
            unselectedIcon = Icons.Outlined.Settings,
            hasNews = true
        )
    )

    var selected by rememberSaveable { mutableIntStateOf(0) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            bottomBar = {
                NavigationBar {
                    listItem.forEachIndexed { index, item ->
                        NavigationBarItem(
                            selected = selected == index,
                            onClick = {
                                selected = index
                                Timber.tag("btm_nav").i(index.toString())
                            },
                            label = { Text(text = item.title) },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (item.badgeCount != null) {
                                            Badge {
                                                Text(text = item.badgeCount.toString())
                                            }
                                        } else if (item.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(
                                        imageVector = if (selected == index) {
                                            item.selectedIcon
                                        } else item.unselectedIcon,
                                        contentDescription = item.title
                                    )
                                }
                            }
                        )
                    }
                }
            }
        ) {  }
    }
}