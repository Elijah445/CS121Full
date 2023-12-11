package week10.Activity20;

import java.util.ArrayList;
import java.util.List;

public class StringArrayList {

    private ArrayList<String> Pokemon = new ArrayList<>();

    public void addPokemon(String Pokemon){
       this.Pokemon.add(Pokemon);
    }

    public void removePokemon(String Pokemon){
        this.Pokemon.remove(Pokemon);
    }

    public int getSizeOfPokemonList(){
        return Pokemon.size();
    }

    public String getPokemon(int index){
        return Pokemon.get(index);
    }

    public void displayPokemon1(){
        System.out.println("Pokemon:");
        for(Object Pokemon: Pokemon){
            System.out.println(Pokemon);
        }
    }

    public void displayPokemon2(){
        System.out.println("Pokemon:");
        for(int i = 0; i < Pokemon.size(); i++){
            System.out.println(Pokemon.get(i));
        }
    }




}
