package com.example.myfirstcomposeapp

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
fun ProfileCard(profile: Profile) {
    Row(modifier = Modifier.padding(10.dp)) {
        Image(
            painter = painterResource(id = if(isSystemInDarkTheme()){R.drawable.profilepicture} else {R.drawable.profilepicturedark}),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(3.dp, MaterialTheme.colors.primary, CircleShape)
        )

        Spacer(modifier = Modifier.size(4.dp))

        Column() {
            Text(text = profile.name, style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = profile.description)
        }
    }

}
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ProfileCardPreview() {
    MyFirstComposeAppTheme() {
        ProfileCard(profile = Profile("Swoyam", "Kotlin Developer"))
    }
}