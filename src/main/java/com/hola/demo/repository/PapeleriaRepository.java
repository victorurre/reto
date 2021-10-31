/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hola.demo.repository;
import com.hola.demo.modelo.Papeleria;
import com.hola.demo.repositorycrud.PapeleriaCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author victor
 */
@Repository
public class PapeleriaRepository {
     @Autowired
    private PapeleriaCrudRepository papeleriaCrudRepository;
      public List<Papeleria> getAll(){
        return (List<Papeleria>) papeleriaCrudRepository.findAll();
    }
        public Optional<Papeleria> getPapeleria(int id){
        return  papeleriaCrudRepository.findById(id);
    }

    public Papeleria save(Papeleria p){
        return papeleriaCrudRepository.save(p);
    }

    public void delete(Papeleria p){
        papeleriaCrudRepository.delete(p);
    }
     
     
    
    
}
