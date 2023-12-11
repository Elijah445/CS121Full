package weekThree;

import javax.swing.*;

public class RestaurantSelector {
    public static void main(String[] args) {
        String y = "Yes";
        String n = "No";
        String vegetarian = JOptionPane.showInputDialog("Is anyone vegetarian?");
        String vegan = JOptionPane.showInputDialog("Is anyone vegan?");
        String gluten = JOptionPane.showInputDialog("Is anyone gluten-free?");

        if (vegetarian.equals(y) && vegan.equals(y) && gluten.equals(y)) {
            JOptionPane.showMessageDialog(null,"Your options are The Chefs Kitchen and Corner Cafe");
        } else if (vegetarian.equals(n) && vegan.equals(n) && gluten.equals(n)) {
            JOptionPane.showMessageDialog(null,"You can go to any restaurant");
        } else if (vegetarian.equals(y) && vegan.equals(n) && gluten.equals(y)) {
            JOptionPane.showMessageDialog(null,"Your options are Main Street Pizza Company, The Chefs Kitchen, and Corner Cafe");
        } else if (vegetarian.equals(y) && vegan.equals(n) && gluten.equals(n)) {
            JOptionPane.showMessageDialog(null,"Your options are Mamas Fine Italian, Main Street Pizza Company, The Chefs Kitchen, and Corner Cafe");
        } else if (vegetarian.equals(y) && vegan.equals(y) && gluten.equals(n)) {
            JOptionPane.showMessageDialog(null,"Your options are The Chefs Kitchen and Corner Cafe");
        } else if (vegetarian.equals(n) && vegan.equals(y) && gluten.equals(y)) {
            JOptionPane.showMessageDialog(null,"Your options are The Chefs Kitchen and Corner Cafe");
        } else if (vegetarian.equals(n) && vegan.equals(n) && gluten.equals(y)) {
            JOptionPane.showMessageDialog(null,"Your options are Main Street Pizza, The Chefs Kitchen, and Corner Cafe");
        } else if (vegetarian.equals(n) && vegan.equals(y) && gluten.equals(n)) {
            JOptionPane.showMessageDialog(null,"Your options are Corner Cafe and the Chefs Kitchen");
        }

    }
}
