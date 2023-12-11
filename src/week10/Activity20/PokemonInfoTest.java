package week10.Activity20;

import java.util.Scanner;

public class PokemonInfoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PokemonInfo pokemoninfo = new PokemonInfo();

        while(true){
            System.out.println("Enter pokemon or q to quit: ");
            String input = scanner.nextLine();
            if(input.equals("q")){
                System.out.println("You have quit");
                break;
            }else{
                pokemoninfo.addPokemon(input);
                System.out.println("Enter Attack Damage: ");
                pokemoninfo.addAttackDamage(Double.parseDouble(scanner.nextLine()));
                System.out.println("Enter the HP of the pokemon");
                pokemoninfo.addHP(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter the tier of this pokemon");
                pokemoninfo.addTier(scanner.next().charAt(0));
                scanner.nextLine();

            }
        }
        pokemoninfo.displayPokemon();

    }
}
