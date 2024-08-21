package com.android.engineer.mealmate.view.utils

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
fun MealTextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    horizontalPadding: Dp = 16.dp,
    text: String,
    textColor: Color = Orange,
) {
    TextButton(
        onClick = onClick,
        colors = ButtonDefaults.textButtonColors(contentColor = Color.Transparent),
        modifier = modifier.padding(horizontal = horizontalPadding)
    ) {
        Text(
            text = text,
            color = textColor
        )
    }
}


@Preview(showBackground = true)
@Composable
fun MealTextButtonPreview() {
    MealTextButton(onClick = { }, text = stringResource(id = R.string.sign_in), modifier = Modifier)
}