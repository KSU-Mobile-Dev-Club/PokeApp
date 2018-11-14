package com.example.laure.pokeapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

public class PokemonAdapter extends ArrayAdapter<Pokemon> {
    private Context context;
    private int layoutResource;
    private List<Pokemon> pokemonList;

    public PokemonAdapter(@NonNull Context context, int listItemLayout, @NonNull List<Pokemon> pokemonList) {
        super(context, listItemLayout, pokemonList);
        this.context = context;
        this.layoutResource = listItemLayout;
        this.pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View listItemView, @NonNull ViewGroup parent) {
        //if the view for a ListItem has not already been created, inflate it
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(context).inflate(layoutResource, parent, false);
        }

        //get the Pokemon from the data source that is at the corresponding position in the list
        //as the current ListItem in the ListView
        Pokemon pokemon = pokemonList.get(position);

        //Get a reference to the ImageView in pokemon_list_layout
        ImageView iv = listItemView.findViewById(R.id.pokemon_image_view);

        //Set the ImageView to hold a picture of the current pokemon
        iv.setImageResource(pokemon.imageResource);

        return listItemView;
    }
}
