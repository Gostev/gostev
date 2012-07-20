package db.checker;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander Gostev
 * Date: 7/19/12
 * Time: 6:14 PM
 */
public class RunMe{

    public static int SECONDS = 1000;
    public static int MINUTES = 60000;

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Output.getCollection();
                Output.fileOut();
            }
        }, new Date(), 1 * SECONDS);
    }
}
