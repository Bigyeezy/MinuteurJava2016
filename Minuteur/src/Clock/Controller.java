package Clock;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Controller implements ActionListener{

	private Model m;
	
	public Controller(Model model)
	{
		m = model;
	}

	public Model getM() {
		return m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        m.decreaseheure();
        System.out.println(getM().getHeure());
	}
}
