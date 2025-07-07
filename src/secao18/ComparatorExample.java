package secao18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

// Comparator para ordenar por preço crescente
class PrecoCrescenteComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

// Comparator para ordenar por preço decrescente
class PrecoDecrescenteComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p2.getPreco(), p1.getPreco());
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("TV", 2500.0));
        produtos.add(new Produto("Notebook", 3200.0));
        produtos.add(new Produto("Celular", 1800.0));

        System.out.println("Lista original:");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        // Ordenar por preço crescente
        Collections.sort(produtos, new PrecoCrescenteComparator());
        System.out.println("\nOrdenado por preço crescente:");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        // Ordenar por preço decrescente
        Collections.sort(produtos, new PrecoDecrescenteComparator());
        System.out.println("\nOrdenado por preço decrescente:");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}