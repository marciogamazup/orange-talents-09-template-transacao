package br.com.zupacademy.marcio.transacao.transacao.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrimario;

    private String idTransacao;

    private BigDecimal valor;

    private LocalDateTime efetivadaEm;

    @Embedded
    private Cartao cartao;

    @Embedded
    private Estabelecimento estabelecimento;

    @Deprecated
    public Transacao() {
    }

    public Transacao(String idTransacao, BigDecimal valor, LocalDateTime efetivadaEm,
                     Cartao cartao, Estabelecimento estabelecimento) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.efetivadaEm = efetivadaEm;
        this.cartao = cartao;
        this.estabelecimento = estabelecimento;
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }
}
