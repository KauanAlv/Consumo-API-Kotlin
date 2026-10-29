package com.example.consumo_api.service

import com.example.consumo_api.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {

    // Aqui eu passo o verbo, e o que quero que seja dinâmico eu faço {}
    @GET("{cep}/json/")
    // Esse call é igual ao await no backend
        // O <Endereco> é a model
    // Esse Path significa = Substitua {} da rota, para o value = "..."
    fun getEnderecoByCep (@Path("cep") cep: String): Call<Endereco>


    @GET("{uf}/{cidade}/{rua}/json")
    fun getEnderecoByUfCidadeRua(
        @Path("uf")     uf: String,
        @Path("cidade") cidade: String,
        @Path("rua")    rua: String
    ):  Call<List<Endereco>>
}