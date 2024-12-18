package br.com.davidlopes.pessoas.concretas;

import br.com.davidlopes.pessoas.abistratas.Pessoa;

public class PessoaJuridica extends Pessoa {
    private Long cnpj;
    private Double faturamento;

    public PessoaJuridica(String nome, Long cnpj, Double faturamento) {
        setNome(nome);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public String tipo() {
        String tipo = getClass().getSimpleName();
        if(tipo.equals("PessoaJuridica") ){
            tipo = "Pessoa jurídica";
        }
        return tipo;
    }

    public void informacao() {
        System.out.println("Tipo: " + tipo() +  " Nome: " + getNome() + " CNPJ "
        + cnpj + " faturamento: " + faturamento + " R$");
    }
}
