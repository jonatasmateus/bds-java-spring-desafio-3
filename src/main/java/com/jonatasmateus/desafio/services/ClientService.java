package com.jonatasmateus.desafio.services;

import com.jonatasmateus.desafio.dto.ClientDTO;
import com.jonatasmateus.desafio.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        return new ClientDTO(repository.findById(id).get());
    }
}
