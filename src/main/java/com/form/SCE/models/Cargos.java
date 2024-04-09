package com.form.SCE.models;

import com.form.SCE.AbstractEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "DEPARTAMENTOS")
public class Cargos extends AbstractEntity<Long> {
    @Column(name = "nome", nullable = false, unique = true,length = 60)
    public String nome;
    @ManyToMany
    @JoinTable(name = "id_departamento_fk")
    public Departamento departamento;
    @OneToMany(mappedBy = "cargos")
    public List<Funcionarios> funcionarios;
}
