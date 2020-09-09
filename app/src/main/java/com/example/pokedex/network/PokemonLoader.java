package com.example.pokedex.network;

import com.example.pokedex.network.models.PokemonByIdResponse;
import com.example.pokedex.network.models.PokemonListResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokemonLoader implements PokemonAPI {
    //Llamo a un objeto pokemonApi. Creo un obj en base a una interfaz xq es la forma en que maneja retrofit internamente sus peticiones
    PokemonAPI pokemonAPI;
    final String URL_BASE = "https://pokeapi.co/api/v2/";

    public PokemonLoader() {
        Retrofit retrofit = new Retrofit.Builder()
                                .baseUrl(URL_BASE)
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();


        //COn la siguiente forma le doy la posibilidad a PokemonAPI de hacer llamadas a la API directamente.
        pokemonAPI = retrofit.create(PokemonAPI.class);
    }

    @Override
    public Call<PokemonListResponse> getPokemonList() {
        return pokemonAPI.getPokemonList();
    }

    @Override
    public Call<PokemonByIdResponse> getPokemonById(String id) {
        return pokemonAPI.getPokemonById(id);
    }
}
