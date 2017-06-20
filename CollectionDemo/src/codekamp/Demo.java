package codekamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cerebro on 19/06/17.
 */
public class Demo {
    public static void main(String[] args) {

        List<String> result = Student.getStudentNames();

        System.out.println(result.get(1));
        System.out.println(result.get(2));

        result.add("Mahesh");

        HashMap<String, Integer> populations = new HashMap<>();

        populations.put("India", 1300000000);
        populations.put("USA", 250000000);


        System.out.println(populations.get("USA"));
    }
}
