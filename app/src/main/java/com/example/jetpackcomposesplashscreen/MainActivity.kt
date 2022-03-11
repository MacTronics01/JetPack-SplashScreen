package com.example.jetpackcomposesplashscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.core.content.ContextCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposesplashscreen.ui.theme.JetPackComposeSplashScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor=ContextCompat.getColor(this, R.color.grey_900)
        setContent {
            JetPackComposeSplashScreenTheme {
                // A surface container using the 'background' color from the theme
                Navigation()
            }
        }
    }
}
// This helps to navigation
@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination ="/splashScreen" ){
        composable("/splashScreen"){
           SplashScreen(navController)
        }
        composable("/mainScreen"){
            MainScreen(navController)
        }
    }
}

