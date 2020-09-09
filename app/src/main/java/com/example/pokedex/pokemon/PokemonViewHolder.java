package com.example.pokedex.pokemon;


//Se va a encargar de inicializar los datos de la vista

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokedex.R;

public class PokemonViewHolder extends RecyclerView.ViewHolder {
    TextView tvPokemonName;
    LinearLayout llPokemonContainer;
    Button btPokemonDelete;


    public PokemonViewHolder(@NonNull View v) {
        super(v);

        tvPokemonName = v.findViewById(R.id.tvPokemonName);
        llPokemonContainer = v.findViewById(R.id.llPokemonContainer);
        btPokemonDelete = v.findViewById(R.id.btPokemonDelete);
    }
}
