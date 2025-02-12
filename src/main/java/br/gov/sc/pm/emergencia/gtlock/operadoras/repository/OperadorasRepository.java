package br.gov.sc.pm.emergencia.gtlock.operadoras.repository;

import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Operadoras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperadorasRepository extends JpaRepository<Operadoras, Long> {
}
