package com.example.pokedex.network.models;

import com.google.gson.annotations.SerializedName;

public class Sprites {
    @SerializedName("back_default")
    private String image;

    public String getImage() {
        return image;
    }
}
