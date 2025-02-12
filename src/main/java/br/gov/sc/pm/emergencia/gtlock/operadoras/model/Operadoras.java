package br.gov.sc.pm.emergencia.gtlock.operadoras.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "Operadoras")
@Table(name = "operadoras")
public class Operadoras {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "descricao" , nullable = false)
    private String descricao;

    @Override
    public String toString() {
        return "Operadoras [id=" + id + ", descricao=" + descricao + "]";
    }
}
