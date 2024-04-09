package com.form.SCE.models;

import com.form.SCE.AbstractEntity;
import com.form.SCE.models.enums.UF;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {
    @Column(nullable = false)
    private String logradouro;
    @Column(nullable = false)
    private String bairro;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false,length = 2)
    @Enumerated(EnumType.STRING)
    private UF uf;
    @Column(nullable = false, length = 9)
    private String cep;
    @Column(nullable = false, length = 5)
    private Integer numero;
    private String complemento;
}
