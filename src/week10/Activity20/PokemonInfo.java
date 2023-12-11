package week10.Activity20;

import java.util.ArrayList;

public class PokemonInfo {
    private ArrayList<Integer> HP = new ArrayList<>();
    private ArrayList<Character> Tier = new ArrayList<>();
    private ArrayList<Double> AttackDamage = new ArrayList<>();
    private ArrayList<String> Pokemon = new ArrayList<>();

    public void addPokemon(String pokemon){
        this.Pokemon.add(pokemon);
    }
    public void addAttackDamage(double damage){
        this.AttackDamage.add(damage);
    }
    public void addTier(char tier){
        this.Tier.add(tier);
    }
    public void addHP(int hp){
        this.HP.add(hp);
    }

    public void displayPokemon(){
        System.out.printf("%-10s%-10s%-10s%s%n","Pokemon","Damage", "Hp", "Tier");
        for(int i = 0; i < Pokemon.size();i++){
            System.out.printf("%-10s%-10.2f%-10d%-10s%n", Pokemon.get(i),AttackDamage.get(i),HP.get(i),Tier.get(i));
        }
    }


}
