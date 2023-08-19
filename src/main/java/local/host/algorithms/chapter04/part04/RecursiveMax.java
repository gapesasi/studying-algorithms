package local.host.algorithms.chapter04.part04;

import java.util.Arrays;

public class RecursiveMax {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        System.out.println(recursiveMax(arr));
    }

    public static int recursiveMax(int[] arr) {
        if (arr.length == 2) {
            return arr[0] > arr[1] ? arr[0] : arr[1];
        }

        int subMax = recursiveMax(Arrays.copyOfRange(arr, 1, arr.length));
        return arr[0] > subMax ? arr[0] : subMax;
    }

}
