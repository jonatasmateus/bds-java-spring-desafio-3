package com.jonatasmateus.desafio.repositories;

import com.jonatasmateus.desafio.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
