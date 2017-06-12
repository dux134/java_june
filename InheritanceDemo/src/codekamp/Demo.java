package codekamp;

/**
 * Created by cerebro on 08/06/17.
 */
public class Demo {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = arr1;
        int[] arr3 = {10, 20, 30, 40};

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);

        arr2[0] = -99;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);

        arr2 = arr3;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);


    }
}
