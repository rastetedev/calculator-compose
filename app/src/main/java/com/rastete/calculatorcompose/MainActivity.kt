package com.rastete.calculatorcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rastete.calculatorcompose.ui.theme.CalculatorComposeTheme
import com.rastete.calculatorcompose.ui.theme.MediumGrey

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorComposeTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp

                Calculator(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MediumGrey)
                        .padding(16.dp),
                    state = state,
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing
                )
            }
        }
    }
}
