package local.host.algorithms.chapter04.part01;

public class LoopSum {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4})); // 10
    }

    private static int sum(int[] arr) {
        int total = 0;
        for (int x = 0; x < arr.length; x++) {
            total += arr[x];
        }

        return total;
    }
}
