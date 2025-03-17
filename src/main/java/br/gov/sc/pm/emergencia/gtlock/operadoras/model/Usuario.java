package br.gov.sc.pm.emergencia.gtlock.operadoras.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String login;

    @Column
    private String senha;

    @Column(name = "roles")
    private List<String> roles;

}
