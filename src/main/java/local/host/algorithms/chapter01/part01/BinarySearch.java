package local.host.algorithms.chapter01.part01;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = { 87, 21, 45, 93 };

        System.out.println(binarySearch(arr, 93));
        System.out.println(binarySearch(arr, 16));
    }

    public static int binarySearch(int[] arr, int item){
        if(isListEmpty(arr)) return -1;

        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while ( leftIndex <= rightIndex){
            int midIndex = ( leftIndex + rightIndex ) / 2;
            int guess = arr[midIndex];

            if (guessEqualsItem(guess, item)) return midIndex;
            else if (guessGreaterThanItem(guess, item)) rightIndex = midIndex - 1;
            else if (guessLessThanItem(guess, item)) leftIndex = midIndex + 1;
        }

        return -1;
    }

    public static boolean isListEmpty(int[] arr){
        return arr.length == 0;
    }

    public static boolean guessEqualsItem(int guess, int item){
        return guess == item;
    }

    public static boolean guessGreaterThanItem(int guess, int item){
        return guess > item;
    }

    public static boolean guessLessThanItem(int guess, int item){
        return guess < item;
    }
}



