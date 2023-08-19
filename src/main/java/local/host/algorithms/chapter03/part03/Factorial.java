package local.host.algorithms.chapter03.part03;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("The factorial of 5 is " + getFactorial(5));
    }

    public static int getFactorial(int number) {
        if (isZeroOrOne(number)) {
            return 1;
        }

        return number * getFactorial(number - 1);
    }

    public static boolean isZeroOrOne(int number) {
        if (number > 1) {
            return false;
        }
        return true;
    }
}
