package com.example.pokedex.network;


// Esta interface va a contenter los endpoints a los cuales tiene q apuntar Retrofit para poder devolverme la respuesta

import com.example.pokedex.network.models.PokemonByIdResponse;
import com.example.pokedex.network.models.PokemonListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokemonAPI {
    //Llamo a la anotación GET
    @GET("pokemones")
    //Le paso lo q me va a devolver
    Call<PokemonListResponse> getPokemonList();

    //Voy a crear un servicio que me permita pasarle una URL y la posición por parámetro
    //El id es el que voy a enviar por parámetro a través de retrofit para poder generar estas peticiones dinámicamente
    @GET("pokemon/{id}")
    Call<PokemonByIdResponse> getPokemonById(@Path("id") String id);

}
