package local.host.algorithms.hackerrank.day04;

import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(2, 1, 5, 3, 4));
        // 2, 1, 5, 3, 4
        // 1, 2, 3, 4, 5
        // 0, 1, 2, 3, 4
        List<Integer> arr02 = new ArrayList<>(List.of(2, 5, 1, 3, 4));

        List<Integer> arr03 = new ArrayList<>(List.of(1, 2, 5, 3, 7, 8, 6, 4));

        // 1, 2, 3, 4, 5, 6, 7, 8
        // 1, 2, 5, 3, 4, 6, 7, 8 -> 2
        // 1, 2, 5, 3, 6, 4, 7, 8 -> 1
        // 1, 2, 5, 3, 7, 6, 4, 8 -> 2
        // 1, 2, 5, 3, 7, 8, 6, 4 -> 2


        // 1, 2, 5, 3, 7, 8, 6, 4


        // 1, 2, 5, 3, 7, 6, 4, 8 -> 2   * O 8 muda 2 posições
        // 1, 2, 5, 3, 6, 4, 7, 8 -> 2   * O 7 muda 2 posições
        // 1, 2, 5, 3, 4, 6, 7, 8 -> 1
        // 1, 2, 3, 4, 5, 6, 7, 8 -> 2
        minimumBribes(arr03);
    }

    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        int size = q.size();

        for (int i = size; i > 0; i--) {
            if(q.get(i - 1) > i){
                int bribe = q.get(i - 1) - i;
                if(bribe > 2){
                    System.out.println("Too chaotic");
                    return;
                }
                bribes += bribe;
            }
        }
        System.out.println(bribes);
    }
}
