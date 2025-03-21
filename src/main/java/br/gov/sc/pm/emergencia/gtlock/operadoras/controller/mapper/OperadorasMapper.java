package br.gov.sc.pm.emergencia.gtlock.operadoras.controller.mapper;

import br.gov.sc.pm.emergencia.gtlock.operadoras.controller.dto.OperadorasDTO;
import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Operadoras;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OperadorasMapper {

    Operadoras toEntity(OperadorasDTO dto);

    @InheritInverseConfiguration
    OperadorasDTO toDTO(Operadoras operadoras);
}
