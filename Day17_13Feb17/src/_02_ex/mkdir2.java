import java.io.File;

/**
 *  creating a directory with user specified name
 *  @author BBK-PiJ-2016-30
 */


public class mkdir2{

    public static void main(String [] args){

        System.out.println("Please enter the name of directory to create: ");
        String userInput = System.console().readLine();

        File directory = new File("./" + userInput);

        directory.mkdir();

    }

}