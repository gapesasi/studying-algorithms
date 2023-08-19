package local.host.algorithms.chapter03;

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
// Recursão
// - Quando uma função chama a si mesma.
// - A recursão é usada para tornar a resposta mais clara
// - A recursão não melhora o desempenho do programa (podendo talvez piorar)
// - A recursão melhora a clareza do código e o "desempenho" do programador.
// Caso base -> Quando a função não chama a si mesma novamente (Evita o loop infinito)
// Caso recursivo -> Quando a função chama  si mesma novamente.

