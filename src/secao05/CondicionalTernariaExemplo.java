package secao05;

public class CondicionalTernariaExemplo {
    public static void main(String[] args) {
        double preco = 30;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
        preco = 10;
        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}
