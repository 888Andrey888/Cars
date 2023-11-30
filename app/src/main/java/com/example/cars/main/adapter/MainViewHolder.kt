package com.example.cars.main.adapter

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.cars.databinding.CarItemBinding
import com.example.cars.models.CarModel
import com.example.hw3_6.loadImage

class MainViewHolder(private val binding: CarItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(car: CarModel, onClick: (car: CarModel) -> Unit) = with(binding) {
        tvMark.text = car.mark
        tvYear.text = car.year
        imgSmall.loadImage(car.image)

        itemView.setOnClickListener {
            Log.d("ololo", "bind: $car")
            onClick(car)
        }
    }
}