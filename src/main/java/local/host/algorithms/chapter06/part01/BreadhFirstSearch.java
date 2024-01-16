package local.host.algorithms.chapter06.part01;

import java.util.*;

public class BreadhFirstSearch {
    //Grapho criado com hashMap, já que é necessárioa  relação de vizinhos
    private static HashMap<String, List<String>> graph = new HashMap<>();

    private static void search() {
        //Criada uma fila para garantir que a pesquisa seja feita na ordem de inserção
        Queue<String> personsQueue = new ArrayDeque<>(graph.get("you"));
        // Criada uma lista de pessoas verificadas para não verificar a mesma pessoa duas vezes
        List<String> verifiedPersons = new ArrayList<>();

        while (!personsQueue.isEmpty()) {
            String person = personsQueue.poll();
            //Somente verifica caso a pessoa não esteja na lista de pessoas verificadas
            if (!verifiedPersons.contains(person)) {
                if (isSeller(person)) {
                    System.out.println(person + " is a mango seller");
                    return;
                }
                verifiedPersons.add(person);
                //Adiciona os vizinhos da pessoa na fila, já que não é um vendedor
                personsQueue.addAll(graph.get(person));
            }
        }
    }

    private static boolean isSeller(String name) {
        return name.endsWith("m");
    }

    public static void main(String[] args) {
        graph.put("you", List.of("alice", "bob", "claire"));
        graph.put("bob", List.of("anuj", "peggy"));
        graph.put("alice", List.of("peggy"));
        graph.put("claire", List.of("thom", "anuj"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        search();
    }
}
