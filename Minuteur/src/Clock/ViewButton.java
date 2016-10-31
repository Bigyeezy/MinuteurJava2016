package Clock;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JComponent;


public class ViewButton extends View{

	/**
	 *  Cette classe ViewButton va créer 3 fenêtre avec des
     *  boutons "+" et "-" qui vont incrémenter respectivement
     *  les Heures, les Minutes et les Secondes
     *  et des zones de texte qui vont afficher les données
	 */
	private static final long serialVersionUID = 1L;
	private JButton button;

	public ViewButton(){

	}
	
	public ViewButton(String s){
		switch(s)
		{
            /*
             *Dans le switch
             * Creation des 3 fenetre avec une partie texte pour afficher l'heure
             * et la définition des dimension des zones de texte.
             * Apres le switch
             * On crée deux bouton que l'on ajoute a la fenêtre ainsi crée avec
             * la définition des dimention des boutons.
             */
			case "Heures":
				TextArea t = new TextArea(getM().HeuretoString());
				t.setPreferredSize(new Dimension(200, 80));
				add(t, BorderLayout.CENTER);
				break;
			case "Minutes":
				TextArea u = new TextArea(getM().MinutetoString());
				u.setPreferredSize(new Dimension(200, 80));
				add(u, BorderLayout.CENTER);
				break;
			case "Secondes":
				TextArea v = new TextArea(getM().SecondetoString());
				v.setPreferredSize(new Dimension(200, 80));
				add(v, BorderLayout.CENTER);
				break;
		}
		//bouton plus
		button = new JButton("+");
		button.setPreferredSize(new Dimension(200,80));
		add(button, BorderLayout.WEST);
        //bouton moins
		button = new JButton("-");
		button.setPreferredSize(new Dimension(200,80));
		add(button, BorderLayout.EAST);
        //ajout de la vu avec bouton dans le model
		getM().getvb().add(this);
	}
	
	private static void creatHeure(){
        //Create and set up the window.
        JFrame frameH = new JFrame("Hours");
        frameH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPaneH = new ViewButton("Heures");
        newContentPaneH.setOpaque(true); //content panes must be opaque
        frameH.setContentPane(newContentPaneH);

        //Display the window.
        frameH.pack();
        frameH.setVisible(true);
	}

	private static void creatMinute(){
        JFrame frameM = new JFrame("Minutes");
        frameM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPaneM = new ViewButton("Minutes");
        newContentPaneM.setOpaque(true); //content panes must be opaque
        frameM.setContentPane(newContentPaneM);

        //Display the window.
        frameM.pack();
        frameM.setVisible(true);
    }

    private static void creatSeconde(){
        JFrame frameS = new JFrame("Secondes");
        frameS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPaneS = new ViewButton("Secondes");
        newContentPaneS.setOpaque(true); //content panes must be opaque
        frameS.setContentPane(newContentPaneS);

        //Display the window.
        frameS.pack();
        frameS.setVisible(true);
    }

	public static void createAndShowGUI() {
        creatHeure();
        creatMinute();
        creatSeconde();
	    }
}
