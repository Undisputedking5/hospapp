package com.example.hospitalmanagementsystem.ui.theme.screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.hospitalmanagementsystem.R
import com.example.hospitalmanagementsystem.data.AuthViewModel
import com.example.hospitalmanagementsystem.navigations.ROUTE_LOGIN
import com.example.hospitalmanagementsystem.navigations.ROUTE_DASHBOARD

@Composable
fun RegisterScreen(navController: NavController) {


    var username by remember { mutableStateOf(value = "") }
    var email by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "") }
    var confirmPassword by remember { mutableStateOf(value = "") }
    var phone by remember { mutableStateOf(value = "") }
    val authViewModel: AuthViewModel = viewModel()
    val context = LocalContext.current
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Transparent
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Green,
                            Color.Red
                        )
                    )
                )
        ) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.masenoschool),
            contentDescription = "Logo",
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
                .border(4.dp,Color.White,CircleShape)
                .shadow(4.dp,CircleShape)
        )

        Text(
            text = "Register here",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red,

            )
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },

            label = { Text(text = "Enter Username") },
            shape = RoundedCornerShape(15.dp),

            leadingIcon = { Icon( Icons.Default.Person, contentDescription = null) },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.DarkGray,
                unfocusedBorderColor = Color.Gray,
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.White,
                focusedLabelColor = Color.DarkGray,
                unfocusedLabelColor = Color.Gray
            )


        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter your email") },
            shape = RoundedCornerShape(15.dp),

            leadingIcon = { Icon(Icons.Default.Email, contentDescription = null) },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.DarkGray,
                unfocusedBorderColor = Color.Gray,
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.White,
                focusedLabelColor = Color.DarkGray,
                unfocusedLabelColor = Color.Gray
            )
        )
        OutlinedTextField(
            value = phone,
            onValueChange = { phone = it },
            label = {Text(text = "Enter your phone number") },
            shape = RoundedCornerShape(15.dp),

            leadingIcon = { Icon(Icons.Default.Phone, contentDescription = null) },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.DarkGray,
                unfocusedBorderColor = Color.Gray,
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.White,
                focusedLabelColor = Color.DarkGray,
                unfocusedLabelColor = Color.Gray
            )
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Please enter password") },
            shape = RoundedCornerShape(15.dp),

            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.DarkGray,
                unfocusedBorderColor = Color.Gray,
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.White,
                focusedLabelColor = Color.DarkGray,
                unfocusedLabelColor = Color.Gray
            )
        )
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text(text = "confirm password") },
            shape = RoundedCornerShape(15.dp),

            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },

            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.DarkGray,
                unfocusedBorderColor = Color.Gray,
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.White,
                focusedLabelColor = Color.DarkGray,
                unfocusedLabelColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.size(16.dp))

        Button(onClick = {
            authViewModel.signup(username=username,
                email=email,
                password=password,
                confirmpassword = confirmPassword,
                phone=phone,
                navController = navController,
                context = context)
            navController.navigate(ROUTE_LOGIN)
        },
//            modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp),
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(text = "Register")
        }

        Spacer(modifier = Modifier.size(16.dp))

        Row {
            Text(text = "Already Registered?", color = Color.Magenta)
            Spacer( modifier = Modifier.width(5.dp))
            Text(text = "Login here",
                color = Color.Green,
                modifier = Modifier.clickable{navController.navigate(ROUTE_LOGIN)})
        }
    }
}







@Preview(showBackground= true,)
@Composable
fun RegisterScreenPreview(){
    RegisterScreen(rememberNavController())
}