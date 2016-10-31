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

	public View()
	{
		m=new Model();
		c=new Controller();
	};

	public View(BorderLayout borderLayout)
	{
		borderLayout=new BorderLayout();
		m=new Model();
		c=new Controller();
	}
	
	
	
	@Override
	public void update(Observable o, Object arg)
	{
		// TODO Auto-generated method stub
		
	}



	public Controller getC() {
		return c;
	}
	public Model getM(){ return m; }

}
