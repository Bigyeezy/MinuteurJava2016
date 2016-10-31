package Clock;

import javax.swing.*;
import java.awt.*;

public class ViewOnly extends View{

	/**
	 *  Cette classe ViewOnly va créer 3 fenêtre avec des
	 *  avec des zones de texte indiquant
	 *  les Heures, les Minutes et les Secondes
	 */
	private static final long serialVersionUID = 1L;
	
	public ViewOnly(){

	}

	public ViewOnly(String s) {
		switch (s) {
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
		getM().getvo().add(this);
	}

	public ViewOnly(BorderLayout borderLayout) {
		super(borderLayout);
		// TODO Auto-generated constructor stub
	}

	private static void creatHeure(){
		//Create and set up the window.
		JFrame frameH = new JFrame("Hours");
		frameH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create and set up the content pane.
		JComponent newContentPaneH = new ViewOnly("Heures");
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
		JComponent newContentPaneM = new ViewOnly("Minutes");
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
		JComponent newContentPaneS = new ViewOnly("Secondes");
		newContentPaneS.setOpaque(true); //content panes must be opaque
		frameS.setContentPane(newContentPaneS);

		//Display the window.
		frameS.pack();
		frameS.setVisible(true);
	}

	public static void createAndShowGUIVO() {
		creatHeure();
		creatMinute();
		creatSeconde();
	}

}
