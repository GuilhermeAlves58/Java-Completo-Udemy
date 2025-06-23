package secao17;

public class Generic<T> {
    private T conteudo;

    public void guardar(T item) {
        conteudo = item;
    }

    public T pegar() {
        return conteudo;
    }
}