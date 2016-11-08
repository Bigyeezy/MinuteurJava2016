package Clock;

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.JFrame;


public class WindowOnly extends JFrame{

	/**
	 *  Cette classe WindowButton va créer 3 fenêtre avecstaticstaticstaticstatic des
	 *  boutons "+" et "-" qui vont incrémenter respectivement
	 *  les Heures, les Minutes et les Secondes
	 *  et des zones de texte qui vont afficher les données
	 */
	private Label lab = new Label(" ");


	public WindowOnly(String s,String donnée){
		this.setTitle(s);
		this.setResizable(false);
		this.setSize(450, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lab.setName(s);
		lab.setText(donnée);

		lab.setPreferredSize(new Dimension(100, 80));
		this.add(lab, BorderLayout.CENTER);
		this.setVisible(true);

	}

	public void setDonnée(String s){
		lab.setText(s);
	}


}