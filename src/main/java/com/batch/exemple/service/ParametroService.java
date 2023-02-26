package com.batch.exemple.service;

import com.batch.exemple.domain.model.Parametro;
import com.batch.exemple.exception.ObjectNotFoundException;
import com.batch.exemple.repository.ParametroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParametroService {

    @Autowired
    private ParametroRepository repository;

    public Parametro findBy(String valor){
        Parametro parametro = repository.findByValor(valor);
        if (parametro == null){
            throw new ObjectNotFoundException(
                    "Parâmetro não encontrado! Valor: " + valor + ", Tipo: " + Parametro.class.getName());
        }
        return parametro;
    }

}
