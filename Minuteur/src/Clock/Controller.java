package Clock;

import java.awt.Event;
import java.util.ArrayList;
import java.util.List;

public class Controller {

	private Event e;
	private ArrayList<View> vues;
	
	public Controller()
	{
		vues=new ArrayList<>();
	}

	public ArrayList<View> getVues()
	{
		return vues;
	}

	public void setVues(ArrayList<View> vues)
	{
		this.vues = vues;
	}
}
