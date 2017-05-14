package _03_ex;

/**
 * Created by BBK-PIJ-2016-30 on 20/02/2017.
 */
public class Counter {
    private int n = 0;
   // public void increase() {
     //   n++;
    //}

    //add synchronized so count is as expected at end of program
    //e.g. 100x1000 = 100000
    public synchronized void increase(){
        n++;
    }
    public int getCount() {
        return n;
    }
}

