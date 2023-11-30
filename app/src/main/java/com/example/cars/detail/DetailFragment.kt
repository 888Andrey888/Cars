package com.example.cars.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cars.databinding.FragmentDetailBinding
import com.example.cars.models.CarModel
import com.example.hw3_6.loadImage


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val car = arguments?.getSerializable("r") as CarModel
        initFields(car)
    }

    private fun initFields(carModel: CarModel) = with(binding) {
        imgDefault.loadImage(carModel.image)
        tvMark.text = carModel.mark
        tvYear.text = carModel.year
    }
}