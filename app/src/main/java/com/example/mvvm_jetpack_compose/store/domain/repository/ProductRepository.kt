package com.example.mvvm_jetpack_compose.store.domain.repository

import arrow.core.Either

interface ProductRepository {

    suspend fun getProducts(): Either<,>

}