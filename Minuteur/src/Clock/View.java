package Clock;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class View extends JPanel 
				  implements Observer{

	/**
	 *
	 */

	private static final long serialVersionUID = 1L;
	private static Model m;
	private Controller c;
    BorderLayout borderLayout;

	public View() {
        borderLayout=new BorderLayout();
		m=new Model();
		c=new Controller(m);
	}

	public View(Model model){
        borderLayout=new BorderLayout();
        m=model;
        c=new Controller(model);
    }

	public View(BorderLayout bl)
	{
        borderLayout=bl;
		m=new Model();
		c=new Controller(m);
	}

    @Override
	public void update(Observable o, Object arg)
	{
		getM().HeuretoString();
        getM().MinutetoString();
        getM().SecondetoString();
		
	}

	public Controller getC() {
		return c;
	}
	public static Model getM(){ return m; }

}
