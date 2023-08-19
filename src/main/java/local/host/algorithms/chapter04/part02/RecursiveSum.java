package local.host.algorithms.chapter04.part02;

import java.util.Arrays;

public class RecursiveSum {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6};
        System.out.println(recursiveSum(arr));
    }

    public static int recursiveSum(int[] arr) {
        if (arr.length == 0) return 0;

        return arr[0] + recursiveSum(Arrays.copyOfRange(arr, 1, arr.length));
    }
}
