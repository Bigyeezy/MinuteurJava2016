package Clock;

/**
 * Created by Flo on 29/10/2016.
 */
public class Main {

    public static void main(String[] args) {


        boolean open;
        Model m;
        Controller c;
        View v;
        AutoIncrement a;

        m = new Model();
        a = new AutoIncrement(m);
        v = new View(m);
        c = new Controller(m, v);

        v.Heures.getPlus().addActionListener(c);
        v.Heures.getMoins().addActionListener(c);

        v.Minutes.getPlus().addActionListener(c);
        v.Minutes.getMoins().addActionListener(c);

        v.Secondes.getPlus().addActionListener(c);
        v.Secondes.getMoins().addActionListener(c);

        open = v.isEnabled();

        while (open){
            a.run();
        }



    }
}
