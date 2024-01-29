package com.example.mvvm_jetpack_compose.store.domain.models

data class Product(
    val id:Int,
    val title:String,
    val price:Double,
    val description:String,
    val category: String,
    val image:String,
    val rating: Rating
)
data class Rating(
    val rage:Double,
    val count:Int
)