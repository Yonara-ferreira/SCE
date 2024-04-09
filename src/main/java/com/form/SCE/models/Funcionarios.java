package com.form.SCE.models;

import com.form.SCE.AbstractEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionarios extends AbstractEntity<Long> {
    @Column(nullable = false,unique = true)
    private String nome;
    @Column(nullable = false,columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal salario;
    @Column(name="data_entrada", nullable = false,columnDefinition = "DATE")
    private LocalDate dataEntrada;
    @Column(name="data_saida", columnDefinition = "DATE")
    private LocalDate dataSaida;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_ik")
    private Endereco endereco;
    @ManyToMany
    @JoinColumn(name ="cargo_id_fk")
    private Cargos cargos;

}
