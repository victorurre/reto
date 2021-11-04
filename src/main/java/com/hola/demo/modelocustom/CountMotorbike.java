/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hola.demo.modelocustom;

/**
 *
 * @author victor
 */
import com.hola.demo.modelo.Motorbike;
public class CountMotorbike {
        private Long total;
    private Motorbike motorbike;

    public CountMotorbike(Long total, Motorbike motorbike) {
        this.total = total;
        this.motorbike = motorbike;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Motorbike getMotorbike() {
        return motorbike;
    }

    public void setMotorbike(Motorbike motorbike) {
        this.motorbike = motorbike;
    }
    
}
