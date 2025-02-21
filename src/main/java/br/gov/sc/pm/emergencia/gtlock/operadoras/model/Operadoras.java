package br.gov.sc.pm.emergencia.gtlock.operadoras.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "Operadoras")
@Table(name = "operadoras")
public class Operadoras {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "operadora")
    private Integer operadora;

    @Column(name = "id")
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Override
    public String toString() {
        return "Operadoras [id=" + id + ", descricao=" + descricao + ", operadora=" + operadora + "]";
    }
}
