package br.com.zupacademy.marcio.transacao.transacao.commons.utils;

import br.com.zupacademy.marcio.transacao.transacao.dto.TransacaoDto;
import br.com.zupacademy.marcio.transacao.transacao.entities.Transacao;
import br.com.zupacademy.marcio.transacao.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @Autowired
    TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoDto dto) {

        Transacao transacao = dto.toModel();
        transacaoRepository.save(transacao);
    }
}