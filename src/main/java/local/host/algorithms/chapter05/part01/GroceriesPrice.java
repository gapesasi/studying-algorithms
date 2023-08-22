package local.host.algorithms.chapter05.part01;

import java.util.HashMap;
import java.util.Map;

public class GroceriesPrice {
    public static void main(String[] args) {
        Map<String, Double> book = new HashMap<>();

        book.put("apple", 0.67);
        book.put("milk", 1.49);
        book.put("avocado", 1.49);

        System.out.println(book);

        System.out.println(book.get("apple"));
    }
}
