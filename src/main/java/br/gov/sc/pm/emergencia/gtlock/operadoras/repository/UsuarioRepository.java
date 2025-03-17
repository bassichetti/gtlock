package br.gov.sc.pm.emergencia.gtlock.operadoras.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sc.pm.emergencia.gtlock.operadoras.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    Usuario findByLogin(String login);

}
