package com.android.engineer.mealmate.view.utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.android.engineer.mealmate.R
import com.android.engineer.mealmate.ui.theme.Orange

@Composable
fun MealFilledButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White,
    backgroundColor: Color = Orange
) {
    androidx.compose.material3.Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        modifier = modifier.fillMaxWidth()
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
    MealFilledButton(onClick = { /*TODO*/ }, text = stringResource(R.string.logout))
}