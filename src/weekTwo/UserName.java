package weekTwo;

import javax.swing.*;

public class UserName {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your first and last name");
        StringBuilder reverseName = new StringBuilder(name);

        JOptionPane.showMessageDialog(null, String.format("%s\n", reverseName.reverse()));
        JOptionPane.showMessageDialog(null, String.format("%s\n", name.toUpperCase()));
        JOptionPane.showMessageDialog(null, String.format("%s\n", name.toLowerCase()));



    }
}
