package br.gov.sc.pm.emergencia.gtlock.operadoras.controller.mapper;

import br.gov.sc.pm.emergencia.gtlock.operadoras.controller.dto.OperadorasDTO;
import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Operadoras;
import br.gov.sc.pm.emergencia.gtlock.operadoras.repository.OperadorasRepository;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;


@Mapper(componentModel = "spring")
public abstract class OperadorasMapper {


    public abstract  Operadoras toEntity(OperadorasDTO dto);

    @InheritInverseConfiguration
    public abstract OperadorasDTO toDTO(Operadoras operadoras);


}
