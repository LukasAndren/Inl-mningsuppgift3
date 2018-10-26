package inlamningsuppgift3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public final class Inlamningsuppgift3 extends JFrame {

    JButton nyttSpel = new JButton("Nytt spel");
    JPanel p2 = new JPanel();
    JButton blank = new JButton("");
    JPanel p = new JPanel();
    JButton[] knappar = new JButton[15];
    int[] tal = new int[]{1, 2, 3, 4, 5, 6, 7, 8,
        9, 10, 11, 12, 13, 14, 15};
    Boolean vinst = false;

    public Inlamningsuppgift3() {
        p.setSize(450, 450);
        p.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 15; i++) {
            knappar[i] = new JButton();
            p.add(knappar[i]);

        }
        p.add(blank);
        add(p);
        p2.add(nyttSpel);
        add(p2, BorderLayout.SOUTH);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        blanda();
        if(ärLöst() == true)
            System.out.println("löst");

    }

    public void blanda() {
//        int index, temp;
//        Random random = new Random();
//        for (int i = tal.length - 1; i > 0; i--) {
//            index = random.nextInt(i + 1);
//            temp = tal[index];
//            tal[index] = tal[i];
//            tal[i] = temp;
//        }

        for (int i = 0; i < 15; i++) {
            knappar[i].setText(tal[i] + "");
        }
    }

    public Boolean ärLöst() {
        for (int i = 0; i < 15 - 1; i++) {
            if (Integer.parseInt(knappar[i].getText()) > Integer.parseInt(knappar[i + 1].getText())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Inlamningsuppgift3 i = new Inlamningsuppgift3();

    }

}
