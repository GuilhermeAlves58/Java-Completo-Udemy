package secao17;

public class GenericsExample {
    public static void main(String[] args) {
        Generic<String> caixaDeTexto = new Generic<>();
        caixaDeTexto.guardar("Olá, mundo!");
        System.out.println(caixaDeTexto.pegar());

        Generic<Integer> caixaDeNumero = new Generic<>();
        caixaDeNumero.guardar(42);
        System.out.println(caixaDeNumero.pegar());
    }
}