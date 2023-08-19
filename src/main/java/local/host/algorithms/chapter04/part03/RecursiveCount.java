package local.host.algorithms.chapter04.part03;

import java.util.Arrays;

public class RecursiveCount {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        System.out.println(recursiveCount(arr));
    }

    public static int recursiveCount(int[] arr){
        if(arr.length == 0) return 0;

        int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
        return 1 + recursiveCount(newArr);
    }
}
