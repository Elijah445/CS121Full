package weekSix.packagesDemo;

import weekSix.packagesDemo.Pokemon;

public class PokemonTest {
    public static void main(String[] args) {

        Pokemon Charmander = new Pokemon("Charmander", "90", "fire", "blast burn","75");
        Charmander.useMove();
        Charmander.evolve();
        Charmander.info();
        //Charmander.heal();



    }
}
