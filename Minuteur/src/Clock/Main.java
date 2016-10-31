package Clock;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Flo on 29/10/2016.
 */
public class Main {

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.

        ArrayList<View> ar = new ArrayList<>();

        BorderLayout borderLayout=new BorderLayout();

        View v = new View(borderLayout);
        ViewButton vb = new ViewButton();
        ViewOnly vo = new ViewOnly();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                vb.createAndShowGUI();
                vo.createAndShowGUIVO();
            }

        });
        ar=v.getM().getvb();
        ar=v.getM().getvo();
    }
}
