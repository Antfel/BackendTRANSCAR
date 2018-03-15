/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transportesscaramutti.Administrativo.Backend.Service.Impl;

import com.transportesscaramutti.Administrativo.Backend.Modelo.Cliente;
import com.transportesscaramutti.Administrativo.Backend.Repository.ClienteRepository;
import com.transportesscaramutti.Administrativo.Backend.Service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author felix
 */
@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public Cliente findByCodigoCliente(Integer codigoCliente) {
        return clienteRepository.findOne(codigoCliente);
    }

    @Override
    public Cliente findByRucCliente(String rucCliente) {
        return clienteRepository.findByRucCliente(rucCliente);
    }

    @Override
    public Cliente findByRazonCliente(String razonCliente) {
        return clienteRepository.findByRazonCliente(razonCliente);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void deleteClienteById(Integer codigoCliente) {
        clienteRepository.delete(codigoCliente);
    }

    @Override
    public List<Cliente> findAllClientes() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public void deleteAllClientes() {
        clienteRepository.deleteAll();
    }

    @Override
    public boolean isClienteExist(Cliente cliente) {
        return clienteRepository.findOne(cliente.getCodigoCliente())!=null;
    }
    
}
