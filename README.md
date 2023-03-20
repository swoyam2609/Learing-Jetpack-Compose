# Learning Jetpack Compose
Welcome to the Learning Jetpack Compose repository - your ultimate resource for mastering Jetpack Compose and building native Android UIs like a pro!

## Introduction
Jetpack Compose is a modern UI toolkit for building native Android apps using declarative programming. With Compose, you can create beautiful, responsive, and efficient UIs in less code and time compared to traditional Android UI frameworks.

## Getting Started
To start learning Jetpack Compose, simply clone this repository and follow the step-by-step tutorials in the tutorials directory. You can also check out the samples directory for sample projects that demonstrate various Compose features and best practices.

## Contributing
If you find any issues or have suggestions for improving this repository, please feel free to create a pull request or submit an issue.

## License
This repository is licensed under the MIT License. See the LICENSE file for more information.

# Notes
## Lecture 02-02 - Composable Functions
- Composable Functions can only be called from other composable functions
- Composable Funcitons wiht non-default parameters are not supported in @Preview

## Lecture 02-03 - Compose Terminology
- Traditional way of changing the view
```kt
findViewbById(), btn.setText(), img.setImageBitmap(bmp)
```
- The industry moved to declarative UI model. Compose is a declarative UI framework
- as Composable functions are written in kotlin rather than in XML, they can be as dynamic as normal Kotlin code.
- Recomposition: Every time the values are changed, the Composable functions are recomposed to update the previous value. Unlike XML, the composable function is intellignet enough to recompose only those funcitons which are updated.

## Lecture 02-04 - Layouts
- In compose you build UI Hierarchy by calling composable functions from other composable functions
- Inserting an image in the App
```kt
Image(painter = painterResource(id = R.drawable.profilepicture), contentDescription = "Profile Picture")
``` 
- To design the composable functions, we use Modifiers in jetpack compose.
- Modifiers allows us to change the composible sizes, layout, appearance and add high level interactions
```kt
Row(modifier = Modifier.padding(10.dp)
```

## Lecture 02-05 - Material Design and Theming
- Matrial theme is built around three things: Colour, Typography and Shape
- Adding custom colours to the app
Move to `app/src/main/java/com/example/myfirstcomposeapp/ui/theme/Color.kt`
```kt
package com.example.myfirstcomposeapp.ui.theme

import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val RandomColour = Color(0xFF678543)
```
- Changing the theme colours
move to `app/src/main/java/com/example/myfirstcomposeapp/ui/theme/Theme.kt`
and do the required changes
```kt
package com.example.myfirstcomposeapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

//Do changes to your theme colours here

private val DarkColorPalette = darkColors(
    primary = Blue600,
    primaryVariant = Blue600,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
)
```
- In compose, we can use the `CompositionLocalProvider` to set the importance of a particular widget
```kt
//High Importance
CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.high) {
                Text(text = profile.name)
            }
            
//Medium Importance
CompositionLocalProvider(LocalContentAlpha provides  ContentAlpha.medium) {
                Text(text = profile.description)
            }
```
- Changing the Font Size of a text
```kt
Text(text = profile.name, style = MaterialTheme.typography.h3)
```

- In Compose you need to manually define custom typography in `app/src/main/java/com/example/myfirstcomposeapp/ui/theme/Type.kt`
```kt
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
```
- Change a particular item as per the night mode
```kotlin
//Here I have changed an image as per the value whether the dark mode is enabled or not
painter = painterResource(id = if(isSystemInDarkTheme()){R.drawable.profilepicture} else {R.drawable.profilepicturedark})

```
