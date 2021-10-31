/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hola.demo.repositorycrud;

import org.springframework.data.repository.CrudRepository;
import com.hola.demo.modelo.Admin;

/**
 *
 * @author victor
 */
public interface AdminCrudRepository extends CrudRepository<Admin,Integer> {
    
}
