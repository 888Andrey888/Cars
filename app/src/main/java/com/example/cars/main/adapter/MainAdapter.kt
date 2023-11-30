package com.example.cars.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cars.databinding.CarItemBinding
import com.example.cars.models.CarModel

class MainAdapter(private val onClick: (car: CarModel) -> Unit) :
    RecyclerView.Adapter<MainViewHolder>() {

    val cars = listOf(
        CarModel(
            "Mersedes",
            "2017",
            "https://www.siestacars.com/wp-content/uploads/2021/06/IMG_6110.jpg"
        ),
        CarModel(
            "Mersedes",
            "2017",
            "https://www.siestacars.com/wp-content/uploads/2021/06/IMG_6110.jpg"
        ),
        CarModel(
            "Mersedes",
            "2017",
            "https://www.siestacars.com/wp-content/uploads/2021/06/IMG_6110.jpg"
        ),
        CarModel(
            "Mersedes",
            "2017",
            "https://www.siestacars.com/wp-content/uploads/2021/06/IMG_6110.jpg"
        ),
        CarModel(
            "Mersedes",
            "2017",
            "https://www.siestacars.com/wp-content/uploads/2021/06/IMG_6110.jpg"
        )
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainViewHolder(
        CarItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun getItemCount()= cars.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(cars[position], onClick)
    }
}