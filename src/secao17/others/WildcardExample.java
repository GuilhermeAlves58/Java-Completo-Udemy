package secao17.others;
import java.util.*;

/* Superclasse e duas subclasses só para ilustrar */
class Animal { public String toString() { return "Animal"; } }
class Dog extends Animal { public String toString() { return "Dog"; } }

public class WildcardExample {

    /* 1. Curinga NÃO limitado – só leitura */
    static void imprimeTudo(List<?> lista) {
        for (Object obj : lista) {          // lê como Object
            System.out.println(obj);
        }
        // lista.add("novo");  // ERRO: não é permitido adicionar (exceto null)
    }

    /* 2. Curinga LIMITADO ACIMA – produtor de dados */
    static double soma(List<? extends Number> numeros) {
        double total = 0;
        for (Number n : numeros) {
            total += n.doubleValue();       // lê como Number
        }
        return total;
    }

    /* 3. Curinga LIMITADO ABAIXO – consumidor de dados */
    static void preencheComInteiros(List<? super Integer> destino) {
        destino.add(10);                    // pode adicionar Integer ou subtipos dele
        destino.add(20);
    }

    public static void main(String[] args) {

        // ----- 1. ?  -----
        List<Animal> animais = Arrays.asList(new Animal(), new Dog());
        imprimeTudo(animais);               // aceita qualquer List<?>

        // ----- 2. ? extends Number  -----
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Double>  dbls = Arrays.asList(4.5, 5.5);
        System.out.println("Soma ints:  " + soma(ints));   // 6.0
        System.out.println("Soma dbls:  " + soma(dbls));   // 10.0

        // ----- 3. ? super Integer  -----
        List<Number> numeros = new ArrayList<>();
        preencheComInteiros(numeros);        // ok porque Number é superclasse de Integer
        System.out.println("Depois de preencher: " + numeros); // [10, 20]
    }
}

