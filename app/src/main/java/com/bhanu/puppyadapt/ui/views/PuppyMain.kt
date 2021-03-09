package com.bhanu.puppyadapt.ui.views

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bhanu.puppyadapt.ui.navigation.Screen
import com.bhanu.puppyadapt.utils.PuppyList

@Composable
fun PuppyMain(toggleTheme: () -> Unit){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.route){
        composable(Screen.Home.route){
            Home(navController, PuppyList.puppyList, toggleTheme)
        }
        composable(Screen.PuppyDetails.route){

        }
    }
}