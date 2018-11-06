package com.example.laure.pokeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class PokemonActivity extends AppCompatActivity {
    int[] pokemonResources = {
            R.drawable.bulba,
            R.drawable.charmander,
            R.drawable.jigglypuff,
            R.drawable.meowth,
            R.drawable.pikachu,
            R.drawable.rattata,
            R.drawable.squirtle };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        ImageView iv = findViewById(R.id.pokemon_image_view);

        //get a random pokemon image resource
        Random random = new Random();
        int i = random.nextInt(pokemonResources.length);
        iv.setImageDrawable(getResources().getDrawable(pokemonResources[i]));
    }
}
