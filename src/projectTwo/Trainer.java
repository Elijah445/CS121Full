package projectTwo;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private ArrayList<Pokemon> myPokemon;

    public Trainer(String name){
        this.name = name;
        this.myPokemon = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addPokemon(Pokemon pokemon){
        myPokemon.add(pokemon);
    }

    public void trainPokemon(){
        for(Pokemon pokemon: myPokemon){
            pokemon.lvlUp();
        }
    }

    public void displayPokemon(){
        for(Pokemon pokemon: myPokemon){
            System.out.println(pokemon);
        }
    }


}
