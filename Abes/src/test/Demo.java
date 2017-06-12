package test;


import test.xyz.Dog;

public class Demo {

    public static void main(String[] args) {

        int x = 10;
        int y = x;
        int z = 10;

        if(x == z) {
            System.out.println("both ints are same");
        } else {
            System.out.println("ints not same");
        }

        System.out.println("-------------------");

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = arr1;
        int[] arr3 = {10, 20, 30, 40};

        if(arr1.equals(arr3)) {
            System.out.println("both arrays are same");
        } else {
            System.out.println("arrays not same");
        }

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);

        arr1[0] = 15;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);


        System.out.println("-------------------");

        Cat c1 = new Cat();
        c1.name = "Mars";

        Cat c2 = c1;

        Cat c3 = new Cat();
        c3.name = "Mars";

        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c3.name);

        c2.name = "Pluto";
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c3.name);
    }
}
