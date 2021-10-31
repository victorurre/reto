/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hola.demo.web;

import com.hola.demo.modelo.Papeleria;
import com.hola.demo.service.PapeleriaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author victor
 */
@RestController
@RequestMapping("/api/Papeleria")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class PapeleriaController {
      @Autowired
    private PapeleriaService papeleriaService;

    @GetMapping("/all")
    public List<Papeleria> getPapelerias(){
        return papeleriaService.getAll();
    }
     @GetMapping("/{id}")
    public Optional<Papeleria> getPapeleria(@PathVariable("id") int id)
    {
        return papeleriaService.getPapeleria(id);
    }
    
    
    
      @PostMapping("/save")
        @ResponseStatus(HttpStatus.CREATED)
       public Papeleria save(@RequestBody Papeleria p){
        return papeleriaService.save(p);
    }
    
}
