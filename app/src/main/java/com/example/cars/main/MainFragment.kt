package com.example.cars.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.cars.R
import com.example.cars.databinding.FragmentMainBinding
import com.example.cars.main.adapter.MainAdapter
import com.example.cars.models.CarModel

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val adapter = MainAdapter(this::onClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }

    private fun initRecycler() {
        binding.rvMain.adapter = adapter
    }

    private fun onClick(car: CarModel) {
        findNavController().navigate(R.id.detailFragment, bundleOf("r" to car))
    }
}