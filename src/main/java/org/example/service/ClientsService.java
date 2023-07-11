package org.example.service;

import org.example.model.Client;
import org.example.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsService {
    @Autowired
    private ClientsRepository repository;


    public void saveClient(Client client){
        validateClient(client);
        this.repository.persist(client);
    }

    public void validateClient(Client client){
        // aplica validações
    }
}
