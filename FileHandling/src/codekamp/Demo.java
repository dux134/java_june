package codekamp;

import java.io.*;
import java.net.URL;
import java.util.Date;

/**
 * Created by cerebro on 05/07/17.
 */
public class Demo {
    public static void main(String[] args) {

//        try {
//            FileReader r = new FileReader("src/codekamp/codekamp.txt");
//
//            r.skip(2);
//
//            BufferedReader reader = new BufferedReader(r);
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());

//        r.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        } catch (IOException e) {
//            System.out.println("Unable to read from file");
//        }


//        try {
//            FileWriter r = new FileWriter("src/codekamp/codekamp.txt");
//            r.write("I love programming");
//            r.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        File f1 = new File("src/codekamp/codekamp.txt");
//        File f2 = new File("src/codekamp");
//
//        File[] files = f2.listFiles();
//
//        for (int i = 0; i < files.length; i++) {
//            System.out.println(files[i].getName());
//        }
//
//        f1.setReadOnly();


        try {
            RandomAccessFile f = new RandomAccessFile("src/codekamp/codekamp.txt", "rw");

//            System.out.println(f.readLine());

            f.seek(f.length());

            String s = "Hello world!";
            f.write(s.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Date d = new Date(1499228528094l);

        System.out.println(d);

    }
}
