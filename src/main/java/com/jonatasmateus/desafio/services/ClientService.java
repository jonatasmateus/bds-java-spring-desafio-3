package com.jonatasmateus.desafio.services;

import com.jonatasmateus.desafio.dto.ClientDTO;
import com.jonatasmateus.desafio.entities.Client;
import com.jonatasmateus.desafio.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Transactional
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = repository.findAll(pageable);
        return result.map(ClientDTO::new);
    }
}
