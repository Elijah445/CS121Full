package weekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String name = "Gamedawg";
        String pass = "Pa$$w0rd";
        String username = JOptionPane.showInputDialog("Enter your username");
        String password = JOptionPane.showInputDialog("Enter your password");

        if (name.equals(username) && pass.equals(password)) {
            JOptionPane.showMessageDialog(null,"Welcome to CS12");
        } else if (!name.equals(username) && pass.equals(password)) {
            JOptionPane.showMessageDialog(null,"The username you entered is incorrect");
        } else if (!pass.equals(password) && name.equals(username)) {
            JOptionPane.showMessageDialog(null,"The password you entered is incorrect");
        }else {
            JOptionPane.showMessageDialog(null,"Both the username and password are incorrect");
        }







    }
}
