package com.bugmaker.composemusic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bugmaker.composemusic.bean.NavItem
import com.bugmaker.composemusic.ui.theme.ComposeMusicTheme
import com.google.android.material.navigation.NavigationBarItemView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMusicTheme {
                Surface(color = MaterialTheme.colors.background) {
                    BottomNav(0)
                }
            }
        }
    }

}

@Composable
private fun BottomNav(id:Int) {
    val list = arrayListOf<NavItem>()
    list.add(NavItem("首页",R.drawable.icon_tab1))
    list.add(NavItem("首页",R.drawable.icon_tab2))
    list.add(NavItem("首页",R.drawable.icon_tab3))

    Row() {
        for (item in list){
            Column() {
                Image(
                    painter = painterResource(item.icon),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier.size(30.dp)
                )
                Text(text = item.name)
            }
        }
    }
    
}

@Composable
fun NavigationItem(){

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeMusicTheme {
       // Greeting("Android")
    }
}