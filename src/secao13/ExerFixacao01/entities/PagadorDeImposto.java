package secao13.ExerFixacao01.entities;

public abstract class PagadorDeImposto {
    private String nome;
    private Double rendaAnual;

    public PagadorDeImposto(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public abstract double imposto();
}
