package br.com.zupacademy.marcio.transacao.transacao.dto;

import br.com.zupacademy.marcio.transacao.transacao.entities.Cartao;
import br.com.zupacademy.marcio.transacao.transacao.entities.Estabelecimento;
import br.com.zupacademy.marcio.transacao.transacao.entities.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoDto {

    private String id;
    private BigDecimal valor;
    private LocalDateTime efetivadaEm;
    private Cartao cartao;
    private Estabelecimento estabelecimento;

    @Deprecated
    public TransacaoDto() {
    }
    public TransacaoDto(TransacaoDto entity) {
        this.id = entity.getId();
        this.valor = entity.getValor();
        this.efetivadaEm = entity.getEfetivadaEm();
        this.cartao= entity.getCartao();
        this.estabelecimento = entity.getEstabelecimento();
    }

    public String getId() {
        return id;
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

    public Transacao toModel() {
        return new Transacao(this.id, this.valor, this.efetivadaEm, this.cartao, this.estabelecimento);
    }
}
