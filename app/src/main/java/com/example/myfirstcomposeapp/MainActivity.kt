package com.example.myfirstcomposeapp

import android.content.res.Configuration
import android.os.Bundle
import android.telecom.Call.Details
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.RowScopeInstance.weight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileCard(profile = Profile("Swoyam", "Kotlin Developer", 121065, 7.86f))
            DetailsCard(profile = Profile("Swoyam", "Kotlin Developer", 121065, 7.86f))
        }
    }
}

data class Profile(val name: String, val description: String, val id: Int, val gpa: Float)

@Composable
fun ProfileCard(profile: Profile) {
    Row(
        modifier = Modifier
            .background(color = Color.Gray)
            .padding(horizontal = 5.dp, vertical = 10.dp)
    ) {
        Image(
            painter = painterResource(
                id = if (isSystemInDarkTheme()) {
                    R.drawable.profilepicture
                } else {
                    R.drawable.profilepicturedark
                }
            ),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .weight(1f)
                .clip(CircleShape)
                .border(3.dp, MaterialTheme.colors.primary, CircleShape)
        )

        Spacer(modifier = Modifier.size(15.dp))

        Column(
            modifier = Modifier
                .weight(2f)
                .height(100.dp)
        ) {
            Text(
                text = profile.name,
                style = MaterialTheme.typography.h3,
                modifier = Modifier.weight(2f)
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = profile.description,
                style = MaterialTheme.typography.h5,
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Composable
fun DetailsCard(profile: Profile) {
    Row(
        modifier = Modifier
            .background(color = Color.Green)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Student Id",
                color = Color.White,
                style = TextStyle(fontWeight = FontWeight.Bold),
            )
        }
        Column(modifier = Modifier.weight(1f)) {

        }
    }
}