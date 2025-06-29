package secao17.others;

import java.util.ArrayList;
import java.util.List;

class Animal {
    void falar() { System.out.println("AnimalContra!"); }
}

class Gato extends AnimalContra {
    @Override
    void falar() { System.out.println("Miau!"); }
}

public class ExemploCovariancia {
    // Produz dados: só vamos LER da lista
    static void imprimirSomDosAnimais(List<? extends AnimalContra> animais) {
        for (AnimalContra a : animais) {
            a.falar();          // ✅ OK: leitura (get)
        }

        // animais.add(new Gato()); // ❌ ERRO de compilação: não podemos escrever (put)
    }

    public static void main(String[] args) {
        List<Gato> listaDeGatos = new ArrayList<>();
        listaDeGatos.add(new Gato());

        imprimirSomDosAnimais(listaDeGatos); // Funciona porque Gato é subclasse de AnimalContra
    }
}
