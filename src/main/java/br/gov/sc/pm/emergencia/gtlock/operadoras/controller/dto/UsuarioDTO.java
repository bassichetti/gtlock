package br.gov.sc.pm.emergencia.gtlock.operadoras.controller.dto;

import java.util.List;

public record UsuarioDTO(String login, String senha, List<String> roles) {

}
