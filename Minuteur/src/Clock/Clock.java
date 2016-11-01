package Clock;

import com.sun.corba.se.spi.monitoring.MonitoringFactories;
import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;

/**
 * Created by Hp on 01/11/2016.
 */
public class Clock {
    private static Model m;
    private static Controller c;
    private static ViewButton viewB;
    private static ViewOnly viewO;

    public Clock(){
        m = new Model();
        c = new Controller(m);
        viewB = new ViewButton(m);
        viewO = new ViewOnly(m);
    }

    public static ViewButton getViewB() {
        return viewB;
    }

    public static ViewOnly getViewO() {
        return viewO;
    }
}
