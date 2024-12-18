package br.com.davidlopes.pessoas.abistratas;

public abstract class Pessoa {
    private String nome;
    public abstract String tipo();
    public abstract void informacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
