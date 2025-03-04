package arroy;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = { "kim", "park", "yi" };

        String[] name = new String[2];
        System.out.println(Arrays.toString(name)); // [null, null]

        int[] arr1 = new int[2];
        System.out.println(Arrays.toString(arr1)); // [0, 0]

        boolean[] arr2 = new boolean[2];
        System.out.println(Arrays.toString(arr2));// [false, false]

    }
}
