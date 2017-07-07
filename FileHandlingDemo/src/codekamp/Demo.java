package codekamp;

import java.io.*;
import java.util.Date;

/**
 * Created by cerebro on 06/07/17.
 */
public class Demo {
    public static void main(String[] args) {

//        try {
//            FileReader f = new FileReader("src/codekamp/xyz.txt");
//
//            while (true) {
//                int output = f.read();
//
//                if(output < 0) {
//                    break;
//                }
//
//                System.out.println((char)output);
//            }
//
//            BufferedReader r = new BufferedReader(f);
//
//            System.out.println(r.readLine());
//
//            f.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            FileWriter f = new FileWriter("src/codekamp/xyz.txt");
//            f.write("Programming is fun and rewarding");
//            f.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            RandomAccessFile file = new RandomAccessFile("src/codekamp/xyz.txt", "rw");
//            System.out.println(file.readLine());
//            System.out.println(file.readLine());
//
//            file.seek(file.length());
//
//            String name = "Suresh";
//
//            file.write(name.getBytes());
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        File f1 = new File("src/codekamp/xyz.txt");
        File f2 = new File("src/codekamp");


        File[] myFiles = f2.listFiles();

        for(int i = 0; i < myFiles.length; i++) {

            System.out.println(myFiles[i].getName());
        }

        Date d = new Date();

        System.out.println(d);

//        8285601665
//        prashant@codekamp.in
        // prashant.konnection
    }
}
