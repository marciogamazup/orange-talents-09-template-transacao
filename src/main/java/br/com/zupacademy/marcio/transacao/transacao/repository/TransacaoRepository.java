package br.com.zupacademy.marcio.transacao.transacao.repository;

import br.com.zupacademy.marcio.transacao.transacao.entities.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
