package com.example.hospitalmanagementsystem.ui.theme.screens.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(){
    Scaffold(
        topBar = {TopAppBar(title= { Text(text = "EduAfya Hospital") },
            colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue,
                    titleContentColor = Color.White
        ) )

//

        }
    )
    { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) { }

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashboardPreview(){
    DashboardScreen()
}