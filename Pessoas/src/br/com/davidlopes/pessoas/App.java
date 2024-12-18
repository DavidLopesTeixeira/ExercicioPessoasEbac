package br.com.davidlopes.pessoas;
import br.com.davidlopes.pessoas.concretas.PessoaFisica;
import br.com.davidlopes.pessoas.concretas.PessoaJuridica;

public class App {
    public static void main(String[] args) {
        PessoaFisica  pessoaFisica = gerarPessoaFisica("David",
                "Lopes", "22/02/2024", 123456789L);
        pessoaFisica.informacao();

        PessoaJuridica pessoaJuridica = gerarPessoaJuridica("Fedex", 556633311L, 152333D);
        pessoaJuridica.informacao();
    }


    private static PessoaFisica gerarPessoaFisica(String nome, String sobrenome,String dataNascimento, Long cpf){
    return new PessoaFisica(nome, sobrenome, dataNascimento, cpf);
    }

    private static PessoaJuridica gerarPessoaJuridica(String nome, Long cnpj, Double faturamento){
        return new PessoaJuridica(nome, cnpj, faturamento);
    }



}
