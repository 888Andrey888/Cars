package com.example.cars.models

import java.io.Serializable

data class CarModel(
    var mark: String,
    var year: String,
    var image: String
): Serializable
