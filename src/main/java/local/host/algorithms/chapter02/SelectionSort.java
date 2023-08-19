package local.host.algorithms.chapter02;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>(arr.size());

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int smallestIndex = findSmallestIndex(arr);

            newArr.add(arr.get(smallestIndex));
            arr.remove(smallestIndex);
        }
        return newArr;
    }

    public static int findSmallestIndex(List<Integer> arr) {
        int smallestInt = arr.get(0);
        int smallestIndex = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallestInt) {
                smallestInt = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}