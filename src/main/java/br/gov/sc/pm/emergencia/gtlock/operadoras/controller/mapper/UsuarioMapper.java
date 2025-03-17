package br.gov.sc.pm.emergencia.gtlock.operadoras.controller.mapper;

import br.gov.sc.pm.emergencia.gtlock.operadoras.controller.dto.UsuarioDTO;

import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Usuario;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toEntity(UsuarioDTO dto);

    @InheritInverseConfiguration
    UsuarioDTO toDTO(Usuario usuario);
}
