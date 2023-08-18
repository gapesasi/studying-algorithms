package local.host.algorithms.hackerrank.day04;

public class RecursiveDigitSum {
    public static void main(String[] args) {
        int i = superDigit("9875", 4);
        System.out.println(i);
    }

    public static int superDigit(String n, int k) {
        if (n.length() <= 1) return Integer.parseInt(n);

        long temp, iterations = 0;

        while (true) {
            temp = 0;
            for (int i = 0; i < n.length(); i++) {
                temp += Long.parseLong(String.valueOf(n.charAt(i)));
            }

            if (iterations == 0) {
                temp *= k;
                iterations = 1;
            }

            if (temp < 10) break;
            n = String.valueOf(temp);
        }

        return (int) temp;
    }
}
