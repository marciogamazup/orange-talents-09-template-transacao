package br.com.zupacademy.marcio.transacao.transacao.commons.errors.exceptions;

public class CartaoNaoExisteException extends RuntimeException{
    public CartaoNaoExisteException() {
        super("Esse número de cartão não existe !!");
    }
}
