package weekFive;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class fileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outPutFile = new File("MyPokemon.txt");
        PrintWriter output =  new PrintWriter(outPutFile);

        String Pokemon,Type,Hp;

        output.printf("%s %s %s\n", "Pokemon", "Type", "Hp");
        for(int i = 1; i <= 3; i++){
            Pokemon = JOptionPane.showInputDialog(String.format("What's your pokemons name %d?", i));
            Type = JOptionPane.showInputDialog("What type of pokemon is this?");
            Hp = JOptionPane.showInputDialog("How much health does this pokemon have?");
            output.printf("%s %s %s\n",Pokemon, Type, Hp);
        }
        output.close();

    }
}
