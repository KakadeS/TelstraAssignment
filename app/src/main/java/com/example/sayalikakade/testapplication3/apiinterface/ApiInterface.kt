package com.example.sayalikakade.testapplication3.apiinterface

import com.example.sayalikakade.testapplication3.viewmodel.CountryViewModel
import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {
    @GET("facts.json")
    fun getCountryDetails(): Call<List<CountryViewModel>>
}