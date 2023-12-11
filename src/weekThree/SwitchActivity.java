package weekThree;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args) {
        String anime = JOptionPane.showInputDialog(null,"Enter an anime");
        String animeInfo = "";
        switch(anime){
            case "Naruto":
                animeInfo = "This anime is about a boy pursuing his dream of becoming Hokage while being an outcast in his village";
                break;
            case "Bleach":
                animeInfo = "Ichigo kurosaki is part soul reaper and now has the power to fight demons and save his friends and the soul society";
                break;
            case "Jujutsu Kaisen":
                animeInfo = "Itadori swallowed a curse object and is now the host of an evil curse";
                break;
            default:
                animeInfo = "There is not enough info about that anime in this program";
                break;
        }
        JOptionPane.showMessageDialog(null,animeInfo);

    }
}
