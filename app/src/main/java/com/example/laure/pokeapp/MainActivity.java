package com.example.laure.pokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Pokemon> pokemonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokemonList = new ArrayList<>();
        PopulatePokemon();

        //TODO: get a reference to the ListView that we created in the activity_main

        //TODO: create an instance of PokemonAdapter - look at the required parameters for its constructor

        //TODO: set the ListView's adapter to the adapter we just created


    }

    private void PopulatePokemon() {
        pokemonList.add(new Pokemon(
                "Squirtle",
                R.drawable.squirtle
        ));

        pokemonList.add(new Pokemon(
                "BULBA",
                R.drawable.bulba
        ));

        pokemonList.add(new Pokemon(
                "Charmander",
                R.drawable.charmander
        ));
        pokemonList.add(new Pokemon(
                "Jigglypuff",
                R.drawable.jigglypuff
        ));
        pokemonList.add(new Pokemon(
                "Pikachu",
                R.drawable.pikachu
        ));
        pokemonList.add(new Pokemon(
                "Rattata",
                R.drawable.rattata
        ));
        pokemonList.add(new Pokemon(
                "Meowth",
                R.drawable.meowth
        ));
    }
}
