package codekamp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cerebro on 19/06/17.
 */
public class Student {

    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<Student> getAll() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Suresh", 20));
        students.add(new Student("Ramesh", 25));
        students.add(new Student("Jignesh", 19));

        return students;
    }
}
