package Clock;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class View extends JPanel
        implements Observer {

    private static Model m;

    WindowButton Heures;
    WindowButton Minutes;
    WindowButton Secondes;

    WindowOnly Minutes_Secondes;
    WindowOnly Heures_Minutes_Secondes;

    public View(Model model) {
        this.m = model;
        m.addObserver(this);

        Heures = new WindowButton("Heures", m.HeuretoString());

        Minutes = new WindowButton("Minutes", m.MinutetoString());

        Secondes = new WindowButton("Secondes", m.SecondetoString());


        Heures_Minutes_Secondes = new WindowOnly("Heures - Minutes - Secondes", m.HeuretoString() + ":" + m.MinutetoString() + ":" + m.SecondetoString());

        Minutes_Secondes = new WindowOnly("Minutes - Secondes", m.MinutetoString() + " - " + m.SecondetoString());

    }

    @Override
    public void update(Observable o, Object arg) {

        Heures.setDonnée(m.HeuretoString());

        Minutes.setDonnée(m.MinutetoString());

        Secondes.setDonnée(m.SecondetoString());

        Minutes_Secondes.setDonnée(m.MinutetoString() + " - " + m.SecondetoString());

        Heures_Minutes_Secondes.setDonnée(m.HeuretoString() + ":" + m.MinutetoString() + ":" + m.SecondetoString());


    }
}


