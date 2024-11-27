package com.swapna.carlist.ui.car

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.swapna.domain.model.Car
import com.swapna.presentation.databinding.CarListItemBinding

class CarAdapter(val carList:ArrayList<Car>) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    class CarViewHolder(val binding: CarListItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(car:Car){
            binding.txtName.text = car.name
            binding.txtPrice.text = car.price
            binding.txtMileage.text = car.mileage
            Glide.with(binding.imgBanner.context).load(car.image).into(binding.imgBanner)

            itemView.setOnClickListener {
                val builder = CustomTabsIntent.Builder()
                val customTabsIntent = builder.build()
                customTabsIntent.launchUrl(it.context, Uri.parse(car.image))
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CarViewHolder (
        CarListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount(): Int = carList.size

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) = holder.bind(carList[position])

    fun addCars(cars:List<Car>){
        carList.addAll(cars)
    }
}