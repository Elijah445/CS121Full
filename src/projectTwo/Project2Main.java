package projectTwo;

public class Project2Main {
    public static void main(String[] args) {
        Pokemon greninja = new Pokemon("Greninja",18);
        Pokemon flygon = new Pokemon("Flygon",22);
        Pokemon gengar = new Pokemon("Gengar",35);
        Pokemon gilgar = new Pokemon("Gilgar", 7);
        Pokemon rayquaza = new Pokemon("Rayquaza",27);

        Trainer elijah = new Trainer("Elijah");
        elijah.addPokemon(greninja);
        elijah.addPokemon(flygon);
        elijah.addPokemon(gengar);
        elijah.addPokemon(gilgar);
        elijah.addPokemon(rayquaza);

        System.out.println("Before Training");
        elijah.displayPokemon();

        elijah.trainPokemon();

        System.out.println("\nAfter Training");
        elijah.displayPokemon();
    }
}
