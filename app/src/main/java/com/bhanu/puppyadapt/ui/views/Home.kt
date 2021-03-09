package com.bhanu.puppyadapt.ui.views

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.bhanu.puppyadapt.model.Puppy
import com.bhanu.puppyadapt.ui.components.PuppyItem
import com.bhanu.puppyadapt.ui.components.TopBar

@Composable
fun Home(navController: NavController, puppyList: List<Puppy>, toggleTheme: () -> Unit){
    LazyColumn{
        item {
            TopBar(toggleTheme = toggleTheme)
            Spacer(modifier = Modifier.height(8.dp))
        }
        items(puppyList){
           puppyList.forEach { puppy ->
              PuppyItem(puppy, onItemClick = {

              })
           }
        }
    }
}