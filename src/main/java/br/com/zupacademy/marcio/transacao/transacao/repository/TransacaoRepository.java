package br.com.zupacademy.marcio.transacao.transacao.repository;

import br.com.zupacademy.marcio.transacao.transacao.entities.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

    List<Transacao> findTop10ByCartaoIdOrderByEfetivadaEmDesc(String id);
}
