package Clock;

/**
 * Created by fmorel002 on 08/11/16.
 */
public class AutoIncrement extends Thread {
    Thread t;
    Model my_m;

    public AutoIncrement(Model m) {
        my_m = m;
    }

    public void run() {
        int i = 1000;
        try {
            t.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int y = 0; y < i / 1000; y++) {
            my_m.increasesconde();
        }
    }
}
