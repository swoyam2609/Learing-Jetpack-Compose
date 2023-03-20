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
