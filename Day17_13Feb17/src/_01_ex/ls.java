import java.io.File;

/**
 * testing of ls method in java
 *  @author BBK-PiJ-2016-30
 */

public class ls{

    public static void main(String [] args) {

        File directory = new File(".");
        // get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }


}