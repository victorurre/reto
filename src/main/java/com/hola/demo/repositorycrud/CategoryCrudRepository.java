/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hola.demo.repositorycrud;

import com.hola.demo.modelo.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author victor
 */
public interface CategoryCrudRepository extends CrudRepository<Category,Integer>{
    
}
