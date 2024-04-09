package com.form.SCE.models;

import com.form.SCE.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {

    @Column(name= "nome", nullable = false, unique = true, length = 60)
    private String nome;
    @OneToMany(mappedBy = "departamentos")
    public List<Cargos> cargos;
}
