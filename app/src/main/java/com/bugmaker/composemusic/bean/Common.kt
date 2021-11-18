package com.bugmaker.composemusic.bean

import androidx.annotation.DrawableRes


data class NavItem(
    val name:String,
    @DrawableRes
    val icon:Int
)
