package com.android.engineer.mealmate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.engineer.mealmate.view.utils.MealFilledButton
import com.android.engineer.mealmate.view.utils.MealText
import com.android.engineer.mealmate.view.utils.MealTextButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(top = 64.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MealText("Welcome to MealMate", 36.sp, TextAlign.Center, modifier = Modifier)
            }
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(bottom = 32.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MealFilledButton(onClick = { /*TODO*/ }, text = stringResource(R.string.logout))
                MealTextButton(onClick = { /*TODO*/ }, text = "SIGN IN", modifier = Modifier)
            }
        }
    }

}
