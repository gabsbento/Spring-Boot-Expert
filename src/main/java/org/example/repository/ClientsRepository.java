package org.example.repository;

import org.example.model.Client;
import org.springframework.stereotype.Repository;

@Repository
public class ClientsRepository {

    public void persist(Client client) {
        // Acessa a base de dados para salvar o cliente
    }
}
