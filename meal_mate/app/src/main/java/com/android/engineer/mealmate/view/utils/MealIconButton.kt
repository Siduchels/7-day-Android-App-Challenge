package com.android.engineer.mealmate.view.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.engineer.mealmate.R
import com.android.engineer.mealmate.ui.theme.Orange

@Composable
fun MealIconButton(
    onClick: () -> Unit,
    text: String,
    icon: Int,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White,
    backgroundColor: Color = Orange
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                tint = textColor
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = text,
                color = textColor
            )
        }
    }
}




@Preview(showBackground = true)
@Composable
fun MealIconButtonPreview() {
    MealIconButton(onClick = { /*TODO*/ }, text = stringResource(id = R.string.meal_card), icon = R.drawable.baseline_credit_card_24,)
}