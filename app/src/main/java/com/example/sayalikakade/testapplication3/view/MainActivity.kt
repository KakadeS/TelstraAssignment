package com.example.sayalikakade.testapplication3.view;

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sayalikakade.testapplication3.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container);
        val fragmentManager = this.getSupportFragmentManager()
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.country_layout, CountryDetailFragment.newInstance())
        fragmentTransaction.commit()
    }
}