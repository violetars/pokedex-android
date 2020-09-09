package com.example.pokedex.network.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PokemonListResponse {
    private int count;
    private String next;
    private String previus;
    //Voy a meter un serialied Name para decirle a mi app q en la pokemon api se llama de una manera y
    // en mi app se va a llamar de otra manera
    @SerializedName("results")
    private List<Pokemon> pokemonList;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevius() {
        return previus;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }
}
