package br.com.zupacademy.marcio.transacao.transacao.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Cartao {

    private String id;

    private String email;

    @Deprecated
    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
