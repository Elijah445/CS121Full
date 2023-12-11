package weekFive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileAppend {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter filewriter = new FileWriter("MyPokemon.txt", true);
            PrintWriter output = new PrintWriter(filewriter);

            String Pokemon = JOptionPane.showInputDialog("What's your pokemons name?");
            String Type = JOptionPane.showInputDialog("What type of pokemon is this?");
            String Hp = JOptionPane.showInputDialog("How much health does this pokemon have");

            output.printf("%s %s %s",Pokemon,Type,Hp);
            filewriter.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("Please fix something");
        }

    }
}
