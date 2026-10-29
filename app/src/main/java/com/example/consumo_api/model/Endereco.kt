package com.example.consumo_api.model

import com.google.gson.annotations.SerializedName

// Organiza como serão as variáveis, passando que a API vai retornar a variável de tal jeito
    // E a variável que vai ser utilizada no sistema vai ser de outro
// Basicamente o Serialized fala: O json retorna logradouro, mas aqui dentro vai ser usado como rua
data class Endereco (
    val cep: String = "",

    @SerializedName("logradouro")
    val rua: String = "",

    @SerializedName("localidade")
    val cidade: String = "",
    val bairro: String = "",
    val uf: String = ""
)