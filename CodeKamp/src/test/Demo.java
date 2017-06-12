package test;

import test.xyz.Dog;

public class Demo {

    public static Dog d1;

    public static void main(String[] args) {

        int x = 10;
        int y = 10;

        if(x == y) {
            System.out.println("variables are equal");
        } else {
            System.out.println("variables not equal");
        }

        int[] arr1 = {10, 20, 30, 40};
        int[] arr3 = {10, 40, 50};

        arr1[0]++;

        arr1 = arr3;

        String s1 = "Hello";

        s1 = "Hello World!";


        // coursetro.com


        arr1 = arr2;

        if(arr1 == arr2) {
            System.out.println("these are also equal");
        } else {
            System.out.println("there are not equal");
        }

        if(arr1.equals(arr2)){
            System.out.println("Yes they are equal by this defintion");
        }


    }
}

