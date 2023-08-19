package local.host.algorithms.chapter03;

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

// Pilha de chamada (Call Stack)
// - A estrutura de dados "pilha" é uma estrutura de dados simples em que quando um
//item é adicionado, é colocado no topo dela (push), e quando é removido, é removido
//do topo da lista e lido (pop).

// Exercício:
// 3.1 - A função "sauda" chama a função "sauda2", que será executada para que a
//primeira função possa continuar.
// 3.2 - Ela não para de crescer.