package secao09;

import secao09.entities09.PessoaEncapsulamento;

public class EncapsulamentoExemplo {
    public static void main(String[] args) {
            // Criando objeto Pessoa
            PessoaEncapsulamento p = new PessoaEncapsulamento("João", 25);

            // Usando getters
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());

            // Usando setters
            p.setNome("Maria");
            p.setIdade(30);
}
}
