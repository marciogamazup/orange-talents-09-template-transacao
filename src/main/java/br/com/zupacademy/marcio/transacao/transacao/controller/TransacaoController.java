package br.com.zupacademy.marcio.transacao.transacao.controller;

import br.com.zupacademy.marcio.transacao.transacao.commons.errors.exceptions.CartaoNaoExisteException;
import br.com.zupacademy.marcio.transacao.transacao.dto.ListaUltimasComprasDto;
import br.com.zupacademy.marcio.transacao.transacao.entities.Transacao;
import br.com.zupacademy.marcio.transacao.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    TransacaoRepository transacaoRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<ListaUltimasComprasDto>> ListaUltimasCompras(@PathVariable String id) {
        List<Transacao> listaTransacoes = transacaoRepository.findTop10ByCartaoIdOrderByEfetivadaEmDesc(id);
         if (listaTransacoes.isEmpty()) {
             throw new CartaoNaoExisteException();
         }
        return ResponseEntity.ok().body(listaTransacoes.stream().map(ListaUltimasComprasDto::new).collect(Collectors.toList()));
    }
}
