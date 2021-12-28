package com.example.myapplication
import androidx.compose.ui.unit.sp
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp

import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface() {
                    ScaffoldSample()
//                    DefaultPreview()
                    //Greeting()
                }
            }
        }
    }
}



@Preview(showBackground =true)
//@Composable
//fun DefaultPreview() {
//    MyApplicationTheme {
//        Scaffold(
//            // below line we are
//            // creating a top bar.
//            topBar = {
//                TopAppBar(
//                    // in below line we are
//                    // adding title to our top bar.
//                    title = {
//                        // inside title we are
//                        // adding text to our toolbar.
//                        Text(
//                            text = "Geeks for Geeks",
//                            // below line is use
//                            // to give text color.
//                            color = Color.White
//                        )
//                    },
////                    navigationIcon = {
////                        // navigation icon is use
////                        // for drawer icon.
////                        IconButton(onClick = { }) {
////                            // below line is use to
////                            // specify navigation icon.
////                            Icon(Icons.Filled.Menu)
////                        }
////                    },
//                    // below line is use to give background color
//                    backgroundColor = Color.Green,
//
//                    // content color is use to give
//                    // color to our content in our toolbar.
//                    contentColor = Color.White,
//
//                    // below line is use to give
//                    // elevation to our toolbar.
//
//                )
//            },
////            bodyContent = {
////                // bodyContent()
////            }
//
//        )
//
//
//
//
//
//    }
//
//
//    }
//
//
//


@Composable
fun ScaffoldSample() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopAppBar(title = {Text("Login Page")},backgroundColor = MaterialTheme.colors.primary,) },
//        floatingActionButtonPosition = FabPosition.End,
//        floatingActionButton = { FloatingActionButton(onClick = {}){
////            Icon(imageVector = , contentDescription = "fab icon")
//        } },
//        drawerContent = { Text(text = "Drawer Menu 1") },

//        bottomBar = { BottomAppBar(backgroundColor = MaterialTheme.colors.primary) { Text("Bottom App Bar") } }
        content = {
                  Column(
                      verticalArrangement = Arrangement.Top,
                      horizontalAlignment = Alignment.CenterHorizontally,
                              modifier = Modifier
                              .fillMaxSize()

                  ) {
                      var Email by remember { mutableStateOf(TextFieldValue("")) }
                      var Password by remember { mutableStateOf(TextFieldValue("")) }

                      Text("Login", fontSize = 25.sp, color = Color.Blue)
                      OutlinedTextField(
                          value = Email,
                          leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = null) },
                          modifier = Modifier
                              .padding(8.dp)
                              .fillMaxWidth(),
                          keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                          label = { Text(text = "Email address") },
                          placeholder = { Text(text = "Your Email") },
                          onValueChange = {
                              Email = it
                          }
                      )
                      OutlinedTextField(
                          value = Password,
                          leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = null) },
                          modifier = Modifier
                              .padding(8.dp)
                              .fillMaxWidth(),
                          keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                          label = { Text(text = "Password ") },
                          placeholder = { Text(text = "Your Password") },
                          onValueChange = {
                              Password = it
                          }
                      )
                      Button(

                          onClick = {


                          },

                          modifier = Modifier.padding(all = Dp(10F)),


                          enabled = true,


                          border = BorderStroke(width = 1.dp, brush = SolidColor(Color.Blue)),


                          shape = MaterialTheme.shapes.medium,
                      )

                      {
                          Text(text = "Login", color = Color.White)
                      }


                  }



        },
    )
}
















