package br.gov.sc.pm.emergencia.gtlock.operadoras.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.gov.sc.pm.emergencia.gtlock.operadoras.controller.dto.UsuarioDTO;
import br.gov.sc.pm.emergencia.gtlock.operadoras.controller.mapper.UsuarioMapper;
import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Usuario;
import br.gov.sc.pm.emergencia.gtlock.operadoras.service.UsuarioService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    private final UsuarioMapper usuarioMapper;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody UsuarioDTO dto) {
        Usuario usuario = usuarioMapper.toEntity(dto);
        usuarioService.salvar(usuario);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(usuario.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}
