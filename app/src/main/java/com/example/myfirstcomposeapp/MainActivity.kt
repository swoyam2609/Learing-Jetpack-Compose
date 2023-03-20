package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileCard(profile = Profile("Swoyam", "Kotlin Developer"))
        }
    }
}

data class Profile(val name: String, val description: String)

@Composable
fun ProfileCard(profile: Profile){
    Column() {
        Text(text = profile.name)
        Text(text = profile.description)
    }
}

@Preview
@Composable
fun ProfileCardPreview(){
    MyFirstComposeAppTheme() {
        ProfileCard(profile = Profile("Swoyam", "Kotlin Developer"))
    }
}