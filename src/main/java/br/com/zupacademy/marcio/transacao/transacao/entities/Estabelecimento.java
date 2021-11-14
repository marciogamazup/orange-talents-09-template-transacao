package br.com.zupacademy.marcio.transacao.transacao.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Estabelecimento {

    private String nome;
    private String endereco;
    private String cidade;

    @Deprecated
    public Estabelecimento() {
    }

    public Estabelecimento(String nome, String endereco, String cidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }
}
