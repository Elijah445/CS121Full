package weekSix.packagesDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    void getName() {
        Pokemon pokemonOne = new Pokemon("Gengar","100","Ghost","ShadowBall","85");
        String name = pokemonOne.getName();
        assertEquals("Gengar",name);
    }
}