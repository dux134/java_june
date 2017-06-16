package codekamp;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by cerebro on 16/06/17.
 */
public class Demo {

    public static void main(String[] args) {



        LinkedList<String> s1 = new LinkedList<>();

        s1.add("Suresh");
        s1.add("Ramesh");
        s1.add("Dharmesh");

        System.out.println(s1);

        s1.remove(1);

        System.out.println(s1);

        s1.add(1, "Jignesh");

        System.out.println(s1);

        s1.add(1, "Chandresh");

        System.out.println(s1);

        System.out.println(s1.get(3));

        System.out.println(s1.size());

        System.out.println(s1.contains("Jignesh"));


        ArrayList<String> s2 = new ArrayList<>();

        s2.add("Aman");
        s2.add("Dhaman");
        s2.add("Chaman");

        s1.addAll(s2);

        System.out.println(s1);
    }
}
