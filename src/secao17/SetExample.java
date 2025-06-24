package secao17;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();


        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("João");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        if (nomes.contains("Ana")) {
            System.out.println("Ana está no conjunto.");
        }

        nomes.remove("João");

        System.out.println("Depois da remoção:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

