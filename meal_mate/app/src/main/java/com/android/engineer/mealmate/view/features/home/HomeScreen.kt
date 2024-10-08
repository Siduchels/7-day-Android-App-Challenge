package com.android.engineer.mealmate.view.features.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.android.engineer.mealmate.R
import com.android.engineer.mealmate.data.utils.DURATION
import com.android.engineer.mealmate.data.utils.FRUITS
import com.android.engineer.mealmate.data.utils.SERVES
import com.android.engineer.mealmate.ui.theme.OrangeOnPrimary
import com.android.engineer.mealmate.ui.theme.OrangePrimary
import com.android.engineer.mealmate.data.utils.STATIC_BREAK_FAST_IMAGE
import com.android.engineer.mealmate.view.utils.custom_views.MealImageLoading
import com.android.engineer.mealmate.view.utils.custom_views.MealLottieAnimation
import com.android.engineer.mealmate.view.utils.custom_views.MealSearchView
import com.android.engineer.mealmate.view.utils.custom_views.MealText

@Composable
fun HomeScreen(navHostController: NavHostController, paddingValues: PaddingValues) {
    val viewModel = hiltViewModel<RecipeViewModel>()
    val loggedInUserName = viewModel.loggedInUserName.value
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(OrangeOnPrimary)
            .padding(paddingValues = paddingValues)
            .padding(all = 28.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        if (viewModel.isScreenLoading.value) {
            MealLottieAnimation(rawResId = R.raw.loading_animation, imageSize = 200.dp)
        } else {
            ShowTopView(userName = loggedInUserName)
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(15.dp))
            if(viewModel.isShowNextMealView.value) {
                ShowNextMeal()
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(15.dp))
            MealSearchView(
                navHostController = navHostController
            )
        }
    }
}

@Composable
fun ShowTopView(userName: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        MealText(text = stringResource(id = R.string.hello).plus(" ").plus(userName).plus(","), fontSize = 30.sp)
        // This feature is disabled.
        /*MealIconButton(
            onClick = {},
            text = stringResource(id = R.string.meal_card),
            icon = R.drawable.ic_meal_card,
            horizontalPadding = 0.dp
        )*/
    }
}

@Composable
fun ShowNextMeal() {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.elevatedCardColors(
            containerColor = Color.White
        ),
        onClick = { },
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 20.dp, end = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(id = R.string.next_meal_for),
                color = OrangePrimary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
            )

            Text(
                text = "1 hr", // Need to calculate
                color = OrangePrimary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            MealImageLoading(imageUrl = STATIC_BREAK_FAST_IMAGE)
            Column(
                modifier = Modifier.padding(vertical = 20.dp),
            ) {
                Text(
                    text = stringResource(id = R.string.break_fast),
                    color = OrangePrimary,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = FRUITS,
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = DURATION,
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = SERVES,
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}
