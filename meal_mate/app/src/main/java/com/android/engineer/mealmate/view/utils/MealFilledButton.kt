package com.android.engineer.mealmate.view.utils

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.android.engineer.mealmate.R
import com.android.engineer.mealmate.ui.theme.Orange

@Composable
fun MealFilledButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String,
    horizontalPadding: Dp  = 16.dp,
    textColor: Color = Color.White,
    backgroundColor: Color = Orange
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        modifier = modifier.padding(horizontal = horizontalPadding)
    ) {
        Text(
            text = text,
            color = textColor,
        )
    }
}








@Preview(showBackground = true)
@Composable
fun MealFilledButtonPreview() {
    MealFilledButton(modifier = Modifier, onClick = { }, text = stringResource(R.string.logout))
}