package secao16.exemplos16;

interface A {
    default void saudacao() {
        System.out.println("Olá de A");
    }
}

interface B extends A {
    @Override
    default void saudacao() {
        System.out.println("Olá de B");
    }
}

interface C extends A {
    @Override
    default void saudacao() {
        System.out.println("Olá de C");
    }
}

class D implements B, C {
    @Override
    public void saudacao() {
        // Resolving the conflict explicitly
        System.out.print("Resolvendo conflito: ");
        B.super.saudacao(); // Ou C.super.saudacao();
    }
}


public class InterfaceMultiplaEProblemaDiamante {
    public static void main(String[] args) {
        D obj = new D();
        obj.saudacao(); // Saída: "Resolvendo conflito: Olá de B"
    }
}

