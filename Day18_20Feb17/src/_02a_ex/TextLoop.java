package _02_ex;

/**
 * Created by BBK-PIJ-201630 on 20/02/2017.
 */
public class TextLoop implements Runnable {

    public static final int COUNT = 10;

    private final String name;

    public TextLoop(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            sleep();
        }
    }
    private void sleep() {
        try {
            Thread.sleep(1000); // Sleep one second
        } catch (InterruptedException ex) {
            ex.printStackTrace(); // Nothing to do, sleep a bit less
        }
    }
}
