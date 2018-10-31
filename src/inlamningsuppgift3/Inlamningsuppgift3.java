package inlamningsuppgift3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public final class Inlamningsuppgift3 extends JFrame implements ActionListener {

    JButton nyttSpel = new JButton("Nytt spel");
    JPanel p2 = new JPanel();
    JPanel p = new JPanel();
    JButton[] knappar = new JButton[16];
    int[] tal = new int[]{1, 2, 3, 4, 5, 6, 7, 8,
        9, 10, 11, 12, 13, 14, 15};

    public Inlamningsuppgift3() {
        p.setSize(450, 450);
        p.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            knappar[i] = new JButton();
            knappar[i].setText(i + 1 + "");
            knappar[i].addActionListener(this);
            p.add(knappar[i]);
        }
        knappar[15].setText("");
        p.add(knappar[15]);
        add(p);
        nyttSpel.addActionListener(this);
        p2.add(nyttSpel);
        add(p2, BorderLayout.SOUTH);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        blanda();

    }

    public void blanda() {
        int index, temp;
        Random random = new Random();
        for (int i = tal.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = tal[index];
            tal[index] = tal[i];
            tal[i] = temp;
        }

        for (int i = 0; i < 15; i++) {
            knappar[i].setText(tal[i] + "");
        }

        knappar[15].setText("");
    }

    public boolean ärLöst() {
        for (int i = 0; i < 16 - 1; i++) {
            if (!knappar[i].getText().equals(i + 1 + "")) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == knappar[0]) {
            if (knappar[1].getText().equals("")) {
                bytPlats(1, 0);
            } else if (knappar[4].getText().equals("")) {
                bytPlats(4, 0);
            }

        } else if (e.getSource() == knappar[1]) {
            if (knappar[0].getText().equals("")) {
                bytPlats(0, 1);
            } else if (knappar[2].getText().equals("")) {
                bytPlats(2, 1);
            } else if (knappar[5].getText().equals("")) {
                bytPlats(5, 1);
            }

        } else if (e.getSource() == knappar[2]) {
            if (knappar[1].getText().equals("")) {
                bytPlats(1, 2);
            } else if (knappar[3].getText().equals("")) {
                bytPlats(3, 2);
            } else if (knappar[6].getText().equals("")) {
                bytPlats(6, 2);
            }

        } else if (e.getSource() == knappar[3]) {
            if (knappar[2].getText().equals("")) {
                bytPlats(2, 3);
            } else if (knappar[7].getText().equals("")) {
                bytPlats(7, 3);
            }

        } else if (e.getSource() == knappar[4]) {
            if (knappar[0].getText().equals("")) {
                bytPlats(0, 4);
            } else if (knappar[5].getText().equals("")) {
                bytPlats(5, 4);
            } else if (knappar[8].getText().equals("")) {
                bytPlats(8, 4);
            }

        } else if (e.getSource() == knappar[5]) {
            if (knappar[1].getText().equals("")) {
                bytPlats(1, 5);
            } else if (knappar[4].getText().equals("")) {
                bytPlats(4, 5);
            } else if (knappar[6].getText().equals("")) {
                bytPlats(6, 5);
            } else if (knappar[9].getText().equals("")) {
                bytPlats(9, 5);
            }

        } else if (e.getSource() == knappar[6]) {
            if (knappar[2].getText().equals("")) {
                bytPlats(2, 6);
            } else if (knappar[5].getText().equals("")) {
                bytPlats(5, 6);
            } else if (knappar[7].getText().equals("")) {
                bytPlats(7, 6);
            } else if (knappar[10].getText().equals("")) {
                bytPlats(10, 6);
            }

        } else if (e.getSource() == knappar[7]) {
            if (knappar[3].getText().equals("")) {
                bytPlats(3, 7);
            } else if (knappar[6].getText().equals("")) {
                bytPlats(6, 7);
            } else if (knappar[11].getText().equals("")) {
                bytPlats(11, 7);
            }

        } else if (e.getSource() == knappar[8]) {
            if (knappar[4].getText().equals("")) {
                bytPlats(4, 8);
            } else if (knappar[9].getText().equals("")) {
                bytPlats(9, 8);
            } else if (knappar[12].getText().equals("")) {
                bytPlats(12, 8);
            }

        } else if (e.getSource() == knappar[9]) {
            if (knappar[5].getText().equals("")) {
                bytPlats(5, 9);
            } else if (knappar[8].getText().equals("")) {
                bytPlats(8, 9);
            } else if (knappar[10].getText().equals("")) {
                bytPlats(10, 9);
            } else if (knappar[13].getText().equals("")) {
                bytPlats(13, 9);
            }

        } else if (e.getSource() == knappar[10]) {
            if (knappar[6].getText().equals("")) {
                bytPlats(6, 10);
            } else if (knappar[9].getText().equals("")) {
                bytPlats(9, 10);
            } else if (knappar[11].getText().equals("")) {
                bytPlats(11, 10);
            } else if (knappar[14].getText().equals("")) {
                bytPlats(14, 10);
            }

        } else if (e.getSource() == knappar[11]) {
            if (knappar[7].getText().equals("")) {
                bytPlats(7, 11);
            } else if (knappar[10].getText().equals("")) {
                bytPlats(10, 11);
            } else if (knappar[15].getText().equals("")) {
                bytPlats(15, 11);
            }

        } else if (e.getSource() == knappar[12]) {
            if (knappar[8].getText().equals("")) {
                bytPlats(8, 12);
            } else if (knappar[13].getText().equals("")) {
                bytPlats(13, 12);
            }

        } else if (e.getSource() == knappar[13]) {
            if (knappar[9].getText().equals("")) {
                bytPlats(9, 13);
            } else if (knappar[12].getText().equals("")) {
                bytPlats(12, 13);
            } else if (knappar[14].getText().equals("")) {
                bytPlats(14, 13);
            }

        } else if (e.getSource() == knappar[14]) {
            if (knappar[10].getText().equals("")) {
                bytPlats(10, 14);
            } else if (knappar[13].getText().equals("")) {
                bytPlats(13, 14);
            } else if (knappar[15].getText().equals("")) {
                bytPlats(15, 14);
            }

        } else if (e.getSource() == knappar[15]) {
            if (knappar[14].getText().equals("")) {
                bytPlats(14, 15);
            } else if (knappar[11].getText().equals("")) {
                bytPlats(11, 15);
            }

        } else if (e.getSource() == nyttSpel) {
            blanda();
        }

    }

    public void bytPlats(int tomKnapp, int trycktKnapp) {
        knappar[tomKnapp].setText(knappar[trycktKnapp].getText());
        knappar[trycktKnapp].setText("");
        if (ärLöst() == true) {
            JOptionPane.showMessageDialog(null, "Grattis, du vann!");
        }

    }

    public static void main(String[] args) {
        Inlamningsuppgift3 i = new Inlamningsuppgift3();

    }

}
