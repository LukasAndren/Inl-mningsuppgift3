package inlamningsuppgift3;

import javax.swing.*;
import java.awt.*;

public class Inlamningsuppgift3 extends JFrame {

    JButton nyttSpel = new JButton("Nytt spel");
    JPanel p2 = new JPanel();
    JButton blank = new JButton("");
    JPanel p = new JPanel();
    JButton[] knappar = new JButton[15];

    public Inlamningsuppgift3() {
        p.setSize(450, 450);
        p.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 15; i++) {
            knappar[i] = new JButton(i + 1 + "");
            p.add(knappar[i]);

        }
        p.add(blank);
        add(p);
        p2.add(nyttSpel);
        add(p2, BorderLayout.SOUTH);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Inlamningsuppgift3 i = new Inlamningsuppgift3();

    }

}
