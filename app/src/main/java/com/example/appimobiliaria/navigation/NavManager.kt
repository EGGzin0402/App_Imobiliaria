package com.example.appimobiliaria.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appimobiliaria.views.AnuncieScreen
import com.example.appimobiliaria.views.ComprarScreen
import com.example.appimobiliaria.views.HomeScreen
import com.example.appimobiliaria.views.NovoScreen
import com.example.appimobiliaria.views.SobreScreen

@Composable
fun NavManager(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home"){
        composable("home"){
            HomeScreen(navController)
        }

        composable("comprar"){
            ComprarScreen(navController)
        }

        composable("novo"){
            NovoScreen(navController)
        }

        composable("anuncie"){
            AnuncieScreen(navController)
        }

        composable("sobre"){
            SobreScreen(navController)
        }


    }

}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
    val navController = rememberNavController()
    HomeScreen(navController)
}