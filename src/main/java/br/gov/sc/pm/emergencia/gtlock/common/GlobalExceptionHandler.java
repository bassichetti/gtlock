package br.gov.sc.pm.emergencia.gtlock.common;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class  GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ErroResposta handleMethodNotValidException(MethodArgumentNotValidException e) {
        System.out.println("Erro: " + e);
        List<FieldError> fieldErrors = e.getFieldErrors();
        List<ErroCampo> listaErrors = fieldErrors.stream().map(fe -> new ErroCampo(
                fe.getField(), fe.getDefaultMessage())).collect(Collectors.toList());
        return new ErroResposta(HttpStatus.UNPROCESSABLE_ENTITY.value(), "Erro de validação", listaErrors);
    }

    @ExceptionHandler(RegistroDuplicadoException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErroResposta handleRegistroDuplicadoException(RegistroDuplicadoException e) {
        return ErroResposta.conflito(e.getMessage());
    }

    @ExceptionHandler(OperacaoNaoPermitidaException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErroResposta handleOperacaoNaoPermitidaException(RegistroDuplicadoException e) {
        return ErroResposta.respostaPadrao(e.getMessage());
    }


    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErroResposta handleErrosNaoTratados(RegistroDuplicadoException e) {
        return new ErroResposta(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Ocoreu un erro inesperado. Entre em contato com o suporte", List.of());
    }
}
