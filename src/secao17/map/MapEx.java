package secao17.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        // Criando um mapa onde a chave é String e o valor é Integer
        Map<String, Integer> idadePessoas = new HashMap<>();

        // Adicionando elementos no Map
        idadePessoas.put("Ana", 25);
        idadePessoas.put("Bruno", 30);
        idadePessoas.put("Carlos", 22);

        // Acessando um valor pela chave
        System.out.println("Idade da Ana: " + idadePessoas.get("Ana"));

        // Verificando se uma chave existe
        if (idadePessoas.containsKey("Carlos")) {
            System.out.println("Carlos está no mapa.");
        }

        // Removendo um elemento
        idadePessoas.remove("Bruno");

        // Percorrendo o Map
        System.out.println("\nLista completa:");
        for (Map.Entry<String, Integer> entry : idadePessoas.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
        }
    }
}
