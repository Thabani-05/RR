package com.example.rr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf

import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rr.ui.theme.RRTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            var TOD by remember{
                mutableStateOf("")
            }

            var Meals by remember {
                mutableStateOf("")
            }


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ){
                Text(
                    text = "Meal Selector",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Black
                )

                Divider()
                Spacer(modifier = Modifier.size(30.dp))
                Text(text = "Welcome Hera!")
                Text(text = "Type Time of the Day eg:")
                Text(text = "Morning")
                Text(text = "Morning snack")
                Text(text = "Afternoon")
                Text(text = "Afternoon snack")
                Text(text = "Dinner")
                Text(text = "After Dinner snack")
                Text(text = "TOD: $TOD")


                OutlinedTextField(
                    value = TOD,
                    onValueChange = { text ->
                       TOD = text

                    },
                    placeholder = {
                        Text(text = "TYPE THE TIME OF THE DAY" )
                    }
                )



                Row {

                    Button(onClick = {
                        Meals = when(TOD){
                           "Morning" -> "Eggs  Coffee  Oatmeal   Green tea   Protein Pancakes"
                            "Morning snack" -> "Yogurt  Fruit   Vegetable  Strawberry smoothie"
                            "Afternoon" -> "Sandwich  Toast   Pizza   Pie   Burger"
                            "Afternoon snack" -> " Cookies   Muffins   Scones   Cupcakes   "
                            "Dinner" -> "Lamb stew and steamed bread   Spaghetti and meatballs   Pasta   pap and beef stew"
                            "After Dinner snack" -> "Ice cream  Brownies  Malva pudding   Banana Bread"
                            else -> "Invalid TIME OF DAY!. Please enter the correct information as shown above"

                        }
                    }) {
                        Text(text = "Suggest" )
                    }
                    Button(onClick = {
                        TOD = ""
                        Meals = ""
                    }) {
                        Text(text = "Reset")
                    }
                }

                Text(text = "Meals by $TOD: is $Meals")





            }


                }
            }
         
            }





