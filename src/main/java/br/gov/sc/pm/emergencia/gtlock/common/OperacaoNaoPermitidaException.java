package br.gov.sc.pm.emergencia.gtlock.common;

public class OperacaoNaoPermitidaException extends RuntimeException {

    public OperacaoNaoPermitidaException(String message) {
        super(message);
    }

    public OperacaoNaoPermitidaException(String message, Throwable cause) {
        super(message, cause);
    }
}