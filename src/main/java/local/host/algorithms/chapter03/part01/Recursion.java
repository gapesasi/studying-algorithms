package local.host.algorithms.chapter03.part01;

public class Recursion {
    public static void main(String[] args) {
        countdown(5);
    }

    private static void countdown(int i) {
        System.out.println(i);

        if (i <= 0) {
            return;
            // caso base
        } else {
            countdown(i - 1);
            // caso recursivo
        }
    }
}

