package Clock;

import javax.swing.*;
import java.awt.*;


public class WindowButton extends JFrame {

    private JButton button1, button2;
    private Label lab = new Label(" ");


    public WindowButton(String s, String donnée) {

        this.setTitle(s);
        lab.setName(s);
        lab.setText(donnée);
        lab.setPreferredSize(new Dimension(200, 80));
        this.add(lab, BorderLayout.CENTER);

        //bouton plus
        button1 = new JButton("+");
        button1.setPreferredSize(new Dimension(200, 80));
        this.add(button1, BorderLayout.WEST);
        //bouton moins
        button2 = new JButton("-");
        button2.setPreferredSize(new Dimension(200, 80));
        this.add(button2, BorderLayout.EAST);
        this.setSize(300, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        //ajout de la vue avec bouton dans le model
    }

    public void setDonnée(String s) {
        lab.setText(s);
    }

    public JButton getPlus() {
        return button1;
    }

    public JButton getMoins() {
        return button2;
    }

}
