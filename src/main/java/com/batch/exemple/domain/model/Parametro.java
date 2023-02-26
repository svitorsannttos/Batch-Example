package com.batch.exemple.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name ="tb_parametro")
public class Parametro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String valor;

    @Column(name = "data_de_cadastro")
    private Date dataCadastro;

}
