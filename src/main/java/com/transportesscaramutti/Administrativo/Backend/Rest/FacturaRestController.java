/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transportesscaramutti.Administrativo.Backend.Rest;

import com.transportesscaramutti.Administrativo.Backend.Modelo.Factura;
import com.transportesscaramutti.Administrativo.Backend.Service.FacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author felix
 */
@CrossOrigin(origins = "*")
@RestController
public class FacturaRestController {
    
    @Autowired
    private FacturaService facturaService;

    @RequestMapping(value = "/factura", method = RequestMethod.GET)
    public ResponseEntity<List<Factura>> listAllFacturas() {
        List<Factura> facturas = facturaService.findAllFacturas();
        if (facturas.isEmpty()) {
            return new ResponseEntity<List<Factura>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Factura>>(facturas, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/factura/{codigoFactura}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Factura> getFactura(@PathVariable("codigoFactura") Integer codigoFactura) {
        System.out.println("Fetching cliente with id " + codigoFactura);
        Factura factura = facturaService.findByCodigoFactura(codigoFactura);
        if (factura == null) {
            System.out.println("cliente with id " + codigoFactura + " not found");
            return new ResponseEntity<Factura>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Factura>(factura, HttpStatus.OK);
    }
    
}

