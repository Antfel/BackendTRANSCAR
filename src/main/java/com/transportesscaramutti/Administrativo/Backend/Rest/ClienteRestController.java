/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transportesscaramutti.Administrativo.Backend.Rest;

import com.transportesscaramutti.Administrativo.Backend.Modelo.Cliente;
import com.transportesscaramutti.Administrativo.Backend.Service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author felix
 */
@CrossOrigin(origins = "*")
@RestController
public class ClienteRestController {
    
    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "/cliente", method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> listAllClientes() {
        List<Cliente> clientes = clienteService.findAllClientes();
        if (clientes.isEmpty()) {
            return new ResponseEntity<List<Cliente>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
    }
    
}

