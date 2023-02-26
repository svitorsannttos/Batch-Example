package com.batch.exemple.service;

import com.batch.exemple.domain.model.Cliente;
import com.batch.exemple.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente insert(Cliente cliente){
        return repository.save(cliente);
    }

}
