package br.gov.sc.pm.emergencia.gtlock.operadoras.controller.mapper;

import br.gov.sc.pm.emergencia.gtlock.operadoras.controller.dto.OperadorasDTO;
import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Operadoras;
import br.gov.sc.pm.emergencia.gtlock.operadoras.repository.OperadorasRepository;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;


@Mapper(componentModel = "spring")
public interface OperadorasMapper  {

    OperadorasMapper INSTANCE = Mappers.getMapper(OperadorasMapper.class);

    @InheritInverseConfiguration
    OperadorasDTO toDto(Operadoras operadoras);

    Operadoras toEntity(OperadorasDTO dto);
}

