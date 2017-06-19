package codekamp;

import java.util.HashMap;
import java.util.List;

/**
 * Created by cerebro on 16/06/17.
 */
public class Demo {

    public static void main(String[] args) {
        List<Student> students = Student.getAll();

//        for(int i = 0; i < students.size(); i++) {
//            System.out.println(students.get(i).name);
//            System.out.println(students.get(i).age);
//            System.out.println("----------------");
//        }

        for (Student s:students) {
            System.out.println(s.name);
            System.out.println(s.age);
            System.out.println("----------------");
        }

        Student s1 = new Student("Rakesh", 18);
        Student s2 = new Student("Mahesh", 21);

        HashMap<String, Student> studentMap = new HashMap<>();

        studentMap.put("class monitor", s1);
        studentMap.put("coordinator", s2);

        HashMap<String, Integer> populations = new HashMap<>();

        populations.put("India", 1300000000);
        populations.put("India", 1500000000);
        populations.put("USA", 200000000);

        System.out.println(populations.get("India"));
    }
}
