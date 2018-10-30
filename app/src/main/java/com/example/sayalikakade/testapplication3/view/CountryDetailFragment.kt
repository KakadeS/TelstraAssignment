package com.example.sayalikakade.testapplication3.view

import android.content.Context
import android.databinding.DataBindingUtil
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.sayalikakade.testapplication3.R
import com.example.sayalikakade.testapplication3.databinding.ActivityMainBinding
import com.example.sayalikakade.testapplication3.helper.CountryHelper

class CountryDetailFragment : Fragment() {

    companion object {
        fun newInstance(): CountryDetailFragment {
            return CountryDetailFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (isOnline()) {
            val binding = DataBindingUtil.inflate<ActivityMainBinding>(
                    inflater, R.layout.activity_main, container, false)
            binding.root
            binding.countryDetailList.layoutManager = LinearLayoutManager(context)
            val countryDetails = CountryHelper.countryData()
            val adapter = CountryAdapter(countryDetails)
            binding.countryDetailList.adapter = adapter
        } else {
            val binding = DataBindingUtil.inflate<ActivityMainBinding>(
                    inflater, R.layout.network_fail, container, false)
        }
        return view
    }

    fun isOnline(): Boolean {
        val connectionManager = activity!!
                .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectionManager.activeNetworkInfo
        return networkInfo != null && networkInfo!!.isConnected()
    }
}
