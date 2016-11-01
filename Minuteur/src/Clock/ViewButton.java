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
	private JButton button1, button2;

    public ViewButton(){}

	public ViewButton(Model model){
        super(model);
	}
	
	public ViewButton(Model m, String s){
        super(m);
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
				Label t = new Label(getM().HeuretoString());
				t.setPreferredSize(new Dimension(200, 80));
				add(t, BorderLayout.CENTER);
				break;
			case "Minutes":
                Label u = new Label(getM().MinutetoString());
				u.setPreferredSize(new Dimension(200, 80));
				add(u, BorderLayout.CENTER);
				break;
			case "Secondes":
                Label v = new Label(getM().SecondetoString());
				v.setPreferredSize(new Dimension(200, 80));
				add(v, BorderLayout.CENTER);
				break;
		}
		//bouton plus
		button1 = new JButton("+");
		button1.setPreferredSize(new Dimension(200,80));
        button1.addActionListener(new Controller(getM()));
		add(button1, BorderLayout.WEST);
        //bouton moins
		button2 = new JButton("-");
		button2.setPreferredSize(new Dimension(200,80));
        button2.addActionListener(new Controller(getM()));
		add(button2, BorderLayout.EAST);
        //ajout de la vu avec bouton dans le model
		getM().getvb().add(this);




	}
	
	private static void creatHeure(){
        //Create and set up the window.
        JFrame frameH = new JFrame("Hours");
        frameH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPaneH = new ViewButton(getM(),"Heures");
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
        JComponent newContentPaneM = new ViewButton(getM(),"Minutes");
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
        JComponent newContentPaneS = new ViewButton(getM(),"Secondes");
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
