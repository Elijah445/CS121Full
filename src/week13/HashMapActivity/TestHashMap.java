package week13.HashMapActivity;

public class TestHashMap {
    public static void main(String[] args) {
        HashMapClass Pokemon = new HashMapClass();

        Pokemon.addKeyValue("Pikachu","Electric");
        Pokemon.addKeyValue("Blastoise","Water");
        Pokemon.addKeyValue("Charizard","Fire");

        Pokemon.displayKeyValue();

        Pokemon.removeKeyValue("Pikachu","Electric");

        Pokemon.displayKeyValue();

    }
}
