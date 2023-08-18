package local.host.algorithms.hackerrank.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>(List.of(
                "3",
                "uxf"
        ));
        System.out.println(gridChallenge(grid));
    }

    public static String sort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < grid.size(); i++) {
            String s = sort(grid.get(i));
            al.add(s);
        }

        int size = al.get(0).length();
        for (int i = 1; i < al.size(); i++) {
            for (int j = 0; j < size; j++) {
                if (al.get(i - 1).charAt(j) > al.get(i).charAt(j)) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
