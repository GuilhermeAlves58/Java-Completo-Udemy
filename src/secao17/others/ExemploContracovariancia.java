package secao17.others;

import java.util.ArrayList;
import java.util.List;

class AnimalContra {
    void falar() { System.out.println("AnimalContra!"); }
}

class Cachorro extends AnimalContra {
    @Override
    void falar() { System.out.println("Au au!"); }
}

public class ExemploContracovariancia {
    // Consome dados: só vamos ESCREVER na lista
    static void adicionarCachorros(List<? super Cachorro> animais) {
        animais.add(new Cachorro());   // ✅ OK: escrita (put)

        // A única leitura segura é como Object
        Object obj = animais.get(0);   // ✅ OK, mas retorna Object
        // Cachorro c = animais.get(0); // ❌ ERRO de compilação
    }

    public static void main(String[] args) {
        List<AnimalContra> listaDeAnimais = new ArrayList<>();
        adicionarCachorros(listaDeAnimais); // Funciona porque AnimalContra é super de Cachorro

        // Verificando resultado
        for (AnimalContra a : listaDeAnimais) {
            a.falar(); // Imprime "Au au!"
        }
    }
}
