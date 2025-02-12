package br.gov.sc.pm.emergencia.gtlock.operadoras.controller.mapper;

import br.gov.sc.pm.emergencia.gtlock.operadoras.controller.dto.OperadorasDTO;
import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Operadoras;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OperadorasMapper {

    OperadorasMapper INSTANCE = Mappers.getMapper(OperadorasMapper.class);

    Operadoras toEntity(OperadorasDTO dto);

    @InheritInverseConfiguration
    OperadorasDTO toDTO(Operadoras model);






}
