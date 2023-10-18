package com.example.appimobiliaria.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appimobiliaria.R
import com.example.appimobiliaria.components.BackButton
import com.example.appimobiliaria.components.ImgCardCorretor
import com.example.appimobiliaria.components.NavContent
import com.example.appimobiliaria.ui.theme.DarkGray
import com.example.appimobiliaria.ui.theme.PrimaryRed

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SobreScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    NavContent()
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = PrimaryRed
                ),
                navigationIcon = {
                    BackButton(){
                        navController.navigate("home")
                    }
                }
            )
        }
    ){
        ContentSobreScreen(navController)
    }
}

@Composable
fun ContentSobreScreen(navController: NavController){
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp, start = 10.dp, end = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ImgCardCorretor(
                "Corretor 1",
                painterResource(R.drawable.corretor)
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp, start = 10.dp, end = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ImgCardCorretor(
                "Corretor 2",
                painterResource(R.drawable.corretor)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun SobrePreview(){
    val navController = rememberNavController()
    SobreScreen(navController)
}