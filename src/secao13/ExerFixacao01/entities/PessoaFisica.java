package secao13.ExerFixacao01.entities;

public class PessoaFisica extends PagadorDeImposto {

    private Double gastoComSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public double imposto() {
        double impostoBasico;

        if (getRendaAnual() < 20000.0) {
            impostoBasico = getRendaAnual() * 0.15;
        } else {
            impostoBasico = getRendaAnual() * 0.25;
        }

        impostoBasico -= gastoComSaude * 0.5;

        return Math.max(0.0, impostoBasico);
    }
}
