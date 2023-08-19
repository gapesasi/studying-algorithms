package local.host.algorithms.chapter02;

import local.host.algorithms.chapter02.part01.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SelectionSortTest {

    @Test
    public void selectionSort_returnsSortedList(){
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        List<Integer> sortedArr = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 10));

        Assertions.assertEquals(sortedArr, SelectionSort.selectionSort(arr));
    }

    @Test
    public void findSmallestIndex_returnSmallestIndex(){
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));

        Assertions.assertEquals(3, SelectionSort.findSmallestIndex(arr));
    }
}