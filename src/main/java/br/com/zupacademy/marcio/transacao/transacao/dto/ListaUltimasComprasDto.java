package br.com.zupacademy.marcio.transacao.transacao.dto;

import br.com.zupacademy.marcio.transacao.transacao.entities.Cartao;
import br.com.zupacademy.marcio.transacao.transacao.entities.Estabelecimento;
import br.com.zupacademy.marcio.transacao.transacao.entities.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ListaUltimasComprasDto {

    private String id;
    private BigDecimal valor;
    private LocalDateTime efetivadaEm;
    private Cartao cartao;
    private Estabelecimento estabelecimento;

    @Deprecated
    public ListaUltimasComprasDto() {
    }

    public ListaUltimasComprasDto(Transacao entity) {
        this.id = entity.getIdTransacao();
        this.valor = entity.getValor();
        this.efetivadaEm = entity.getEfetivadaEm();
        this.cartao = entity.getCartao();
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
}
