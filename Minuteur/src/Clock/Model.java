package Clock;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

public class Model extends Observable{

	

	private static int maxHeure=24;
	private static int maxMinSec=60;
	private int heure, minute, seconde;
	private Date date = new Date();
	private Calendar calendar = GregorianCalendar.getInstance();

	Model()
	{
		calendar.setTime(date);
		heure = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
		seconde = calendar.get(Calendar.SECOND);
	}

	public void increaseheure(){
		this.heure++;
		if(this.heure%maxHeure==0)
		{
			this.heure=0;
		}
		setChanged();
		notifyObservers();
	}
	
	public void increaseminute(){
		this.minute++;
		if(this.minute%maxMinSec==0)
		{
			this.minute=0;
			this.increaseheure();
		}
        setChanged();
        notifyObservers();
	}
	
	public void increasesconde(){
		this.seconde++;
		if(this.seconde%maxMinSec==0)
		{
			this.seconde=0;
			this.increaseminute();
		}
		setChanged();
        notifyObservers();

	}
	
	public void decreaseheure(){
		this.heure--;
		if(this.heure<0)
		{
			this.heure=23;
		}
        setChanged();
        notifyObservers();
	}
	
	public void decreaseminute(){
		this.minute--;
		if(this.minute<0)
		{
			this.minute=59;
			this.decreaseheure();
		}
        setChanged();
        notifyObservers();
	}
	
	public void decreaseseconde(){
		this.seconde--;
		if(this.seconde<0)
		{
			this.seconde=59;
			this.decreaseminute();
		}
        setChanged();
        notifyObservers();
	}

	public String HeuretoString()
	{
		return String.valueOf(heure);
	}

	public String MinutetoString()
	{
		return String.valueOf(minute);
	}

	public String SecondetoString()
	{
		return String.valueOf(seconde);
	}
	
}
