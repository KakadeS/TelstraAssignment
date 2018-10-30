package com.example.sayalikakade.testapplication3.view

import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import com.example.sayalikakade.testapplication3.R
import com.example.sayalikakade.testapplication3.databinding.RowCountryDetailBinding
import com.example.sayalikakade.testapplication3.viewmodel.CountryViewModel
import com.squareup.picasso.Picasso


class CountryAdapter(private val countryDetails: List<CountryViewModel>) : RecyclerView.Adapter<CountryAdapter.BindingHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingHolder {
        val binding = DataBindingUtil.inflate<RowCountryDetailBinding>(
                LayoutInflater.from(parent.context),
                R.layout.row_country_detail, parent, false)
        return BindingHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingHolder, position: Int) {
        val binding = holder.binding
        binding.countryInfo = countryDetails.get(position)
    }

    override fun getItemCount(): Int {
        return countryDetails.size
    }
    @BindingAdapter("imageHref")
    fun loadImage(imageView: ImageView, url: String) {
        if (url != "") {
            Picasso.with(imageView.getContext()).load(url).placeholder(R.drawable.loading).resize(200, 200).into(imageView)
        }
    }

    inner class BindingHolder(val binding: RowCountryDetailBinding) : RecyclerView.ViewHolder(binding.getRoot())
}

