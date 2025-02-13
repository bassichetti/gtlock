package br.gov.sc.pm.emergencia.gtlock.operadoras.controller;



import br.gov.sc.pm.emergencia.gtlock.operadoras.controller.dto.OperadorasDTO;
import br.gov.sc.pm.emergencia.gtlock.operadoras.controller.mapper.OperadorasMapper;

import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Operadoras;
import br.gov.sc.pm.emergencia.gtlock.operadoras.service.OperadorasService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/operadoras")
@RequiredArgsConstructor
public class OperadorasController {

    private final OperadorasService operadorasService;

    private final OperadorasMapper operadorasMapper;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody OperadorasDTO dto) {
        try {

            Operadoras operadoras = operadorasMapper.toEntity(dto);
            operadorasService.salvar(operadoras);

//            URI location = ServletUriComponentsBuilder
//                    .fromCurrentRequest()
//                    .path("{/{id}")
//                    .buildAndExpand(operadoras.getId())
//                    .toUri();
            return ResponseEntity.ok().build();

        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }

    }

}
