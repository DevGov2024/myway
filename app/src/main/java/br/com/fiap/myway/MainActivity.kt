package br.com.fiap.myway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.myway.screen.HomeScreen
import br.com.fiap.myway.screen.LoginScreen

import br.com.fiap.myway.screen.AuthenticationScreen
import br.com.fiap.myway.screen.ScoreScreen
import  br.com.fiap.myway.screen.BiometricsScreen
import br.com.fiap.myway.ui.theme.MyWayTheme
import br.com.fiap.myway.screen.FingerprintScreen
import br.com.fiap.myway.screen.DocumentAnalysisScreen
import br.com.fiap.myway.screen.SimSwapScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent{
            MyWayTheme {
          //LoginScreen()
         val navController = rememberNavController()

           NavHost(
               navController = navController,
               startDestination = "Login"


           ){

               composable(route = "Login"){ LoginScreen(navController =navController)}
               composable(route = "Home"){ HomeScreen(navController = navController)}

               composable(route = "Authentication") {AuthenticationScreen(navController = navController)}
               composable(route = "Score") { ScoreScreen(navController = navController) }
               composable(route = "Biometrics") { BiometricsScreen(navController = navController) }
               composable(route = "Biometrics") { BiometricsScreen(navController = navController) }
               composable(route = "Fingerprint") { FingerprintScreen(navController = navController) }
               composable(route = "DocumentAnalysis") { DocumentAnalysisScreen(navController = navController) }
               composable(route = "SimSwap") { SimSwapScreen(navController = navController) }

            }
        }
    }
    }
}



