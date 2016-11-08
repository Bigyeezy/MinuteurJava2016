package Clock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Model m;
    private View v;

    public Controller(Model model, View view) {
        this.m = model;
        this.v = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == v.Heures.getPlus()){
            m.increaseheure();
        }
        if(e.getSource() == v.Heures.getMoins()){
            m.decreaseheure();
        }
        if(e.getSource() == v.Minutes.getPlus()){
            m.increaseminute();
        }
        if(e.getSource() == v.Minutes.getMoins()){
            m.decreaseminute();
        }
        if(e.getSource() == v.Secondes.getPlus()){
            m.increasesconde();
        }
        if(e.getSource() == v.Secondes.getMoins()){
            m.decreaseseconde();
        }


    }
}
