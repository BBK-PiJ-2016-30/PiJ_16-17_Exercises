package _02b_ex;

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
            System.out.print("Sleeping for a second");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(200);
                System.out.print(".");
            }
            System.out.println("done!");
        } catch (InterruptedException ex) {
            ex.printStackTrace(); // Nothing to do, sleep a bit less
        }
    }
}
