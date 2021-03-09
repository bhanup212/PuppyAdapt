package com.bhanu.puppyadapt.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.bhanu.puppyadapt.R

@Composable
fun TopBar(toggleTheme:() -> Unit){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Hello Puppies",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.h4,
                color = MaterialTheme.colors.surface
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Adopt a new puppy near you",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.subtitle1,
                color = MaterialTheme.colors.surface
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 24.dp, 36.dp, 0.dp),
            horizontalArrangement = Arrangement.End
        ) {
            PuppyThemeSwitch(toggleTheme)
        }
    }
}

@Composable
fun PuppyThemeSwitch(toggle: () -> Unit){
    val isDarKTheme  = if (isSystemInDarkTheme())
        painterResource(id = R.drawable.ic_baseline_dark_mode_on)
    else
        painterResource(id = R.drawable.ic_baseline_dark_mode_off)

    Icon(
        painter = isDarKTheme,
        contentDescription = null,
        modifier = Modifier.size(24.dp, 24.dp).clickable(onClick = toggle)
    )
}