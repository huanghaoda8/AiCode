package com.huanghaoda.aicode

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class WelcomeScreenTest {
    @get:Rule val composeRule = createComposeRule()

    @Test fun showsWelcomeScreen() {
        composeRule.setContent { AiCodeApp() }
        composeRule.onNodeWithText("欢迎使用 AiCode").assertIsDisplayed()
        composeRule.onNodeWithText("你的 Kotlin Android 项目已准备就绪").assertIsDisplayed()
    }
}
