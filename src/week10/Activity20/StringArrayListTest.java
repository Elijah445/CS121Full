package week10.Activity20;

import week10.Activity20.StringArrayList;

public class StringArrayListTest {
    public static void main(String[] args) {

        StringArrayList pokemon = new  StringArrayList();

        pokemon.addPokemon("Pikachu");
        pokemon.addPokemon("Charizard");
        pokemon.addPokemon("Gengar");

        System.out.printf("Pokemon contains %d elements.%n", pokemon.getSizeOfPokemonList());
        pokemon.displayPokemon1();

        System.out.printf("%nRemove first element: %s %n", pokemon.getPokemon(0));
        pokemon.removePokemon("Pikachu");

        System.out.printf("%nPokemon contains %d elements.%n", pokemon.getSizeOfPokemonList());
        pokemon.displayPokemon2();

    }
}
