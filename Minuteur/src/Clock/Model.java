package Clock;

import java.util.List;
import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable{

	private ArrayList<View> vb;
	private ArrayList<View> vo;

	private static int maxHeure=24;
	private static int maxMin=60;
	private static int maxSec=60;
	private int heure, minute, seconde;
	
	Model(){
		setHeure(10);
		setMinute(12);
		setSeconde(5);
		vb=new ArrayList<>();
		vo=new ArrayList<>();
	}

	public ArrayList<View> getvb()
	{
		return vb;
	}

	public void setvb(ArrayList<View> vbut)
	{
		vb=vbut;
	}

	public ArrayList<View> getvo()
	{
		return vo;
	}

	public void setvo(ArrayList<View> vonly)
	{
		vo=vonly;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSeconde() {
		return seconde;
	}

	public void setSeconde(int seconde) {
		this.seconde = seconde;
	}
	
	public void increaseheure(){
		this.heure++;
		if(this.heure%maxHeure==0)
		{
			this.heure=0;
		}
	}
	
	public void increaseminute(){
		this.minute++;
		if(this.minute%maxMin==0)
		{
			this.minute=0;
			this.increaseheure();
		}
	}
	
	public void increasesconde(){
		this.seconde++;
		if(this.seconde%maxSec==0)
		{
			this.seconde=0;
			this.increaseminute();
		}
	}
	
	public void decreaseheure(){
		this.heure--;
		if(this.heure<0)
		{
			this.heure=23;
		}
	}
	
	public void decreaseminute(){
		this.minute--;
		if(this.minute<0)
		{
			this.minute=59;
			this.decreaseheure();
		}
	}
	
	public void decreaseseconde(){
		this.seconde--;
		if(this.seconde<0)
		{
			this.seconde=59;
			this.decreaseminute();
		}
	}

	public String HeuretoString()
	{
		return "Heure "+this.getHeure();
	}

	public String MinutetoString()
	{
		return "Minute "+this.getMinute();
	}

	public String SecondetoString()
	{
		return "Seconde "+this.getSeconde();
	}
	
}
