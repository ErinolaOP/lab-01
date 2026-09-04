package com.example.petshop

import Cat
import Dog
import Pet
import Pettable
import Scorpion
import Mood
import Happy
import Sad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        enableEdgeToEdge()
//        setContent {
//            PetShopTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//     }
        //  }

            val cat = Cat("Coco", 6)
            val dog = Dog("Mochi", 6)
            val scorpion = Scorpion("Stinger", 32)

            val pets = mutableListOf(cat, dog, scorpion)


            val pettablePets = mutableListOf<Pettable>(cat, dog)
            //** Participation Exercise **\\

            val happyMood = Happy("Sept 4th, 2099") // prints happy on sept 4th, 2099
            val sadMood = Sad("everyday") // "This pet is feeling sad everyday"





        }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        PetShopTheme {
            Greeting("Android")
        }
    }
}