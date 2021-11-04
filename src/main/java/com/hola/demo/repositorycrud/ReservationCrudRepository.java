/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hola.demo.repositorycrud;

import com.hola.demo.modelo.Reservation;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author victor
 */

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer>{
     //select count(*) as "total", carId from reservation group by carId order by total desc;

    @Query("SELECT c.motorbike, COUNT(c.motorbike) from Reservation AS c group by c.motorbike order by COUNT(c.motorbike) DESC")
    public List<Object[]> countTotalReservationsByMotorbike();


    //select clientId, count(*) as "total" from reservation group by clientId order by total desc;
    @Query("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationsByClient();

    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date dateOne,Date dateTwo );

    public List<Reservation>findAllByStatus(String status);
   
    
}
