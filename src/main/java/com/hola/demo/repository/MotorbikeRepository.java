/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hola.demo.repository;
import com.hola.demo.modelo.Motorbike;
import com.hola.demo.repositorycrud.MotorbikeCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author victor
 */
@Repository
public class MotorbikeRepository {
      @Autowired
    private MotorbikeCrudRepository motorbikeCrudRepository;

    public List<Motorbike> getAll(){
        return (List<Motorbike>) motorbikeCrudRepository.findAll();
    }

    public Optional<Motorbike> getMotorbike(int id){
        return motorbikeCrudRepository.findById(id);
    }

    public Motorbike save(Motorbike motorbike){
        return motorbikeCrudRepository.save(motorbike);
    }
    public void delete(Motorbike motorbike){
        motorbikeCrudRepository.delete(motorbike);
    }
    
}
