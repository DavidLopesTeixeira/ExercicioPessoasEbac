package br.com.davidlopes.pessoas.concretas;

import br.com.davidlopes.pessoas.abistratas.Pessoa;

public class PessoaFisica extends Pessoa {
    private String sobrenome;
    private String dataNascimento;
    private Long cpf;

    public PessoaFisica(String nome, String sobrenome, String dataNascimento, Long cpf) {
        setNome(nome);
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String tipo() {
        String tipo = getClass().getSimpleName();
        if(tipo.equals("PessoaFisica")){
            tipo = "Pessoa física";
        }
        return tipo;
    }

    @Override
    public void informacao() {
        System.out.println( "Tipo: " + tipo() + " Nome: " + getNome()
        + " " + sobrenome + " data de nascimento: " + dataNascimento
        + " CPF " + cpf);
    }
}
