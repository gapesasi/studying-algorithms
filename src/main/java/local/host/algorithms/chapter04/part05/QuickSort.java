package local.host.algorithms.chapter04.part05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(quicksort(Arrays.asList(10, 5, 2, 3)));
    }

    public static List<Integer> quicksort(List<Integer> arr) {
        if (arr.size() < 2) return arr;

        Integer pivot = arr.get(0);

        // Sub-Array de todos os elementos menores que o pivô
        List<Integer> less = arr.stream().skip(1).filter(el -> el <= pivot)
                .collect(Collectors.toList());

        // Sub-Array de todos os elementos maiores que o pivô
        List<Integer> greater = arr.stream().skip(1).filter(el -> el > pivot)
                .collect(Collectors.toList());

        return Stream.of(
                        quicksort(less).stream(),
                        Stream.of(pivot),
                        quicksort(greater).stream())
                .flatMap(Function.identity()).collect(Collectors.toList());

    }
}

