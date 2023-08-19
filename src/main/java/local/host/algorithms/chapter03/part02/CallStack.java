package local.host.algorithms.chapter03.part02;

public class CallStack {
    public static void main(String[] args) {
        greet("Adit");
    }
    private static void greet(String name) {
        System.out.println("Hello, " + name + "!");
        greet2(name);
        System.out.println("Getting ready to say bye...");
        bye();
    }
    private static void greet2(String name) {
        System.out.println("How are you, " + name + "?");
    }

    private static void bye() {
        System.out.println("Ok, bye!");
    }
}
