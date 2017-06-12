package test.xyz;

import test.Demo;

public class Dog {

    public static int averageAge = 10;

    public String name;
    public int age;



    public static void talk() {

        System.out.println("Wuff Wuff");
    }

    public void introduceYourself() {
        System.out.println("Hi I am " + this.name + " and I am dog");
    }

    public boolean isOlderThan(Dog otherDog) {

        String s2 = "Hello";

        int[] arr2 = {10, 20, 30, 40};

        System.out.println(arr2[0]);

        System.out.println(s2);

        if(this.age > otherDog.age) {
            return true;
        } else {
            return false;
        }
    }


    public static void introduceYourselfStatic(Dog d) {
        System.out.println("Hi I am " + d.name + " and I am dog");
    }


}
