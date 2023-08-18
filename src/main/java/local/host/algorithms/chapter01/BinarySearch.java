package local.host.algorithms.chapter01;

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

// Exercício 1.1
// 128 -> 64 - 32 - 16 - 8 - 4 - 2 - 1
// Resposta: Um máximo de 7 etapas.

// Exercício 1.2
// 256 - 128 - 64 - 32 - 16 - 8 - 4 - 2 - 1
// Resposta: Um máximo de 8 etapas, aumentando apenas uma.

// Notação Big O
// Busca simples -> Tempo de execução é O(n)
// Busca binária -> Tempo de execução é O(log n)

//Exercícios

//1.3 - O(log n)
//1.4 - O(n)
//1.5 - O(n)
//1.6 - O(n)

//2.1 - Uma lista encadeada.

//2.2 - Lista encadeada, o trabalho exige muitas inserções e nenhuma requisição aleatória.
//2.3 - Como um array (E ele necessita ser ordenado)
//2.4 - A desvantagem do Array é que ele necessita mudar todos os itens na memória para
//inserir um novo, além de que após a inserção do usuário o array terá de ser reordenado
//para satisfazer a busca binária, tornando o processo ainda mais lento.
//2.5 - É mais rápida que os arrayse de mesmo tempo que listas encadeadas para inserções
// e remoções.
