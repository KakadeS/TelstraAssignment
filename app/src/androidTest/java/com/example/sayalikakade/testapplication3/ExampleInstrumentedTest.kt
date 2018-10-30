package com.example.sayalikakade.testapplication3


import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.RecyclerView

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.sayalikakade.testapplication3", appContext.packageName)
    }

    @Test
    fun scrollToItemBelowFold_checkItsText()
    {
        //Scroll to the 3rd position and click
        onView(ViewMatchers.withId(R.id.countryDetailList))
                .perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(3,
                        click()));

    }
}
