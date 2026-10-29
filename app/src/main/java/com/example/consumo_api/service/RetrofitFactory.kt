package com.example.consumo_api.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

// RetrofitFactory é uma fabrica, ela que vai ser responsável por conectar
    // o cliente com a requisição HTTP
class RetrofitFactory {

    private val BASE_URL_VIACEP = "https://viacep.com.br/ws/"

    private val retrofitFactoryViaCep = Retrofit
        .Builder()
        .baseUrl(BASE_URL_VIACEP)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getEnderecoService(): EnderecoService {
        return retrofitFactoryViaCep.create(EnderecoService::class.java)
    }
}