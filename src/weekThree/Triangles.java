package weekThree;

import javax.swing.*;
import java.util.Objects;

public class Triangles {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Enter a length of a triangle");
        String n2 = JOptionPane.showInputDialog("Enter a second side of a triangle");
        String n3 = JOptionPane.showInputDialog("Enter a third side of a triangle");

        if (Objects.equals(n1, n2) && Objects.equals(n1, n3)) {
            JOptionPane.showMessageDialog(null,"This is an Equilateral Triangle");
        } else if (!Objects.equals(n1,n2) && !Objects.equals(n1,n3) && !Objects.equals(n2,n3)) {
            JOptionPane.showMessageDialog(null,"This is a Scalene Triangle");
        } else {
            JOptionPane.showMessageDialog(null,"This is a Isosceles Triangle");
        }


    }
}
