package weekTwo;
import javax.swing.JOptionPane;

public class WordGame {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        String age = JOptionPane.showInputDialog("Enter your age");
        String city = JOptionPane.showInputDialog("What city do you live in?");
        String college = JOptionPane.showInputDialog("What college do you attend?");
        String major = JOptionPane.showInputDialog("What is your major?");
        String animal = JOptionPane.showInputDialog("Enter a type of animal");
        String petname = JOptionPane.showInputDialog("What is your pets name?");
        System.out.print("There once was a boy named ");
        System.out.print(name);
        System.out.print(" who lived in ");
        System.out.print(city);
        System.out.print(". At the age of ");
        System.out.print(age);
        System.out.print(" ");
        System.out.print(name);
        System.out.print(" went to college at ");
        System.out.print(college);
        System.out.println(". ");
        System.out.print(name);
        System.out.print(" graduated with a degree in ");
        System.out.print(major);
        System.out.print(". Then, ");
        System.out.print(name);
        System.out.print(" adopted a ");
        System.out.print(animal);
        System.out.print(" named ");
        System.out.print(petname);
        System.out.print(". They both lived happily ever after!");


    }
}
