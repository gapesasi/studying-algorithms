package local.host.algorithms.chapter05.part02;

import java.util.HashMap;

public class CheckVoter {
    private static final HashMap<String, Boolean> voted = new HashMap<>();

    public static void main(String[] args) {
        checkVoter("Tom");
        checkVoter("Mike");
        checkVoter("Tom");
    }

    public static void checkVoter(String s) {
        if(voted.containsKey(s)) {
            System.out.println(s + " - Mande embora");
        } else {
            voted.put(s, true);
            System.out.println(s + " - Deixe votar");
        }
    }
}
