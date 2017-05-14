package _03_ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by daneb on 13/02/2017.
 * @author BBK-PiJ-2016-30
 */


public class Cat {

    public static void main(String[] args) {
        Cat c = new Cat();
        for (int i = 0; i < args.length; i++) {
            c.launch(args[i]);
        }
    }

    public void launch(String name) {
        File file = new File(name);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File " + file + " does not exist");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeReader(in);
        }
    }

    private void closeReader(Reader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}