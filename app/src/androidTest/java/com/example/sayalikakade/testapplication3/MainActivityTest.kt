package com.example.sayalikakade.testapplication3

import android.support.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import android.support.test.filters.SdkSuppress
import android.support.test.rule.ActivityTestRule
import android.util.Log
import org.junit.Assert.*
import com.example.sayalikakade.testapplication3.view.MainActivity
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    var activityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    @SdkSuppress(minSdkVersion = 15)
    fun testMinSdkVersion() {
        Log.d("Test Filters", "Checking for min sdk >= 15")
        val activity = activityTestRule.getActivity()
        assertNotNull("MainActivity is not available", activity)
    }

}