/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transportesscaramutti.Administrativo.Backend.Service;

import com.transportesscaramutti.Administrativo.Backend.Modelo.Cliente;
import java.util.List;

/**
 *
 * @author felix
 */
public interface ClienteService {
    
    Cliente findByCodigoCliente(Integer codigoCliente);
    Cliente findByRucCliente(String rucCliente);
    Cliente findByRazonCliente(String razonCliente);
    void saveCliente(Cliente cliente);
    void updateCliente(Cliente cliente);
    void deleteClienteById(Integer codigoCLiente);
    List<Cliente> findAllClientes();
    void deleteAllClientes();
    public boolean isClienteExist(Cliente cliente);
    
}
