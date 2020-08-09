package com.linminphyo.nowincompose

import androidx.ui.test.*
import com.linminphyo.nowincompose.sample.Counter
import com.linminphyo.nowincompose.sample.CounterFinal
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class CounterTest {
    @get:Rule
    val componentTestRule = createComposeRule()

    @Test
    fun firstTest() {
        componentTestRule.setContent {
            CounterFinal(0)
        }

        repeat(2){ onNodeWithText("+").performClick() }
        onNodeWithText("2").assertIsDisplayed()

        repeat(3){ onNodeWithText("-").performClick() }
        onNodeWithText("-1").assertIsDisplayed()

    }


}