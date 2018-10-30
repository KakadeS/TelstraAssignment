package com.example.sayalikakade.testapplication3.helper

import android.util.Log
import com.example.sayalikakade.testapplication3.apiinterface.ApiInterface
import com.example.sayalikakade.testapplication3.viewmodel.CountryViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList


object CountryHelper {
    internal var countryDetailList: List<CountryViewModel> = ArrayList()
    fun countryData(): List<CountryViewModel> {

        val apiService = ApiClient.getClient()?.create(ApiInterface::class.java)
        val call = apiService?.getCountryDetails()
        call?.enqueue(object : Callback<List<CountryViewModel>> {
            override fun onResponse(call: Call<List<CountryViewModel>>, response: Response<List<CountryViewModel>>) {
                countryDetailList = response.body()
            }

            override fun onFailure(call: Call<List<CountryViewModel>>, t: Throwable) {
                Log.e(this.toString(), t.message)
            }
        })
        return countryDetailList
    }
}






