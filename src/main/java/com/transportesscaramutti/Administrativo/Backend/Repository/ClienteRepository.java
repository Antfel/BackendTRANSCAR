/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transportesscaramutti.Administrativo.Backend.Repository;

import com.transportesscaramutti.Administrativo.Backend.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author felix
 */
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
    
    Cliente findByRucCliente(String rucCliente);
    Cliente findByRazonCliente(String razonCliente);
    
}
