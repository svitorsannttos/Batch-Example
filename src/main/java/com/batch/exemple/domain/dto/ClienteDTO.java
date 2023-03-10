package com.batch.exemple.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ClienteDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String dataNascimento;
    private String sexo;
    private String renda;

}
