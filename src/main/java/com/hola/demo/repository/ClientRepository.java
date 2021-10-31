/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hola.demo.repository;

import com.hola.demo.modelo.Client;
import com.hola.demo.modelo.Category;
import com.hola.demo.repositorycrud.CategoryCrudRepository;
import com.hola.demo.repositorycrud.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author victor
 */
@Repository
public class ClientRepository {
      @Autowired
    private ClientCrudRepository clientCrudRepository;
    public List<Client> getAll(){
        System.out.println("Respositorio");
        return (List<Client>) clientCrudRepository.findAll();
    }
    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }

    public Client save(Client client){
        return clientCrudRepository.save(client);
    }
    public void delete(Client client){
        clientCrudRepository.delete(client);
    }

    
}
