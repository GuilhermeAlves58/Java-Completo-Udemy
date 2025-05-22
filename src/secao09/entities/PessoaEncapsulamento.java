package secao09.entities;

public class PessoaEncapsulamento {
    // Atributos privados (encapsulados)
    private String nome;
    private int idade;

    // Construtor
    public PessoaEncapsulamento(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    // Getter para nome
    public String getNome(){
        return nome;
    }
    // Setter para nome
    public void setNome(String nome){
        this.nome = nome;
    }
    // Getter para idade
    public int getIdade(){
        return idade;
    }
    // Setter para idade com validação
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
