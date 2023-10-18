package com.example.appimobiliaria.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appimobiliaria.components.NavContent
import com.example.appimobiliaria.components.RedButton
import com.example.appimobiliaria.ui.theme.PrimaryRed

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.shadow(
                    elevation = 10.dp
                ),
                title = {
                    NavContent()
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = PrimaryRed
                ),
                navigationIcon = {

                }
            )
        }
    ){
        ContentHome(navController)
    }
}

@Composable
fun ContentHome(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(PrimaryRed)
        .padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //COMPRAR
        RedButton(text = "Comprar", icon = Icons.Default.ShoppingCart){
            navController.navigate("comprar")
        }

        Spacer(modifier = Modifier.height(28.dp))

        //ALUGAR
        RedButton(text = "Alugar", icon = Icons.Default.Home){
            navController.navigate("comprar")
        }

        Spacer(modifier = Modifier.height(28.dp))

        //NOVOS
        RedButton(text = "Novos", icon = Icons.Default.Add){
            navController.navigate("novo")
        }

        Spacer(modifier = Modifier.height(28.dp))

        //ANUNCIE NO APP
        RedButton(text = "Anuncie no App", icon = Icons.Default.Edit){
            navController.navigate("Anuncie")
        }

        Spacer(modifier = Modifier.height(28.dp))

        //NOSSO TIME
        RedButton(text = "Nosso time", icon = Icons.Default.AccountCircle){
            navController.navigate("sobre")
        }

        Spacer(modifier = Modifier.height(28.dp))

        //SOBRE NÓS
        RedButton(text = "Sobre nós", icon = Icons.Default.Person){
            navController.navigate("sobre")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
    val navController = rememberNavController()
    HomeScreen(navController)
}