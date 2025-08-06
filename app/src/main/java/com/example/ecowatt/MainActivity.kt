package com.example.ecowatt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.ecowatt.nav.AppNavGraph
import com.example.ecowatt.screens.ForgotPasswordScreen
import com.example.ecowatt.screens.HomeScreen
import com.example.ecowatt.ui.theme.EcoWattTheme
import com.example.ecowatt.screens.OnboardingScreen
import com.example.ecowatt.screens.SignInScreen
import com.example.ecowatt.screens.SignUpScreen
import com.example.ecowatt.viewModel.AuthViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcoWattTheme {
                val navController = rememberNavController()
                val authViewModel = AuthViewModel()
//                AppNavGraph(navController, authViewModel)
                ForgotPasswordScreen(navController, authViewModel)
            }
        }
    }
}