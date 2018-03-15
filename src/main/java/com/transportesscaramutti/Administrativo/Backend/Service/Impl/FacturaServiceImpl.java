/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transportesscaramutti.Administrativo.Backend.Service.Impl;

import com.transportesscaramutti.Administrativo.Backend.Modelo.Factura;
import com.transportesscaramutti.Administrativo.Backend.Repository.FacturaRepository;
import com.transportesscaramutti.Administrativo.Backend.Service.FacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author felix
 */
@Service
public class FacturaServiceImpl implements FacturaService{
    
    @Autowired
    private FacturaRepository facturaRepository;
    
    @Override
    public Factura findByCodigoFactura(Integer codigoFactura) {
        return facturaRepository.findOne(codigoFactura);
    }

    @Override
    public List<Factura> findAllFacturas() {
        return (List<Factura>) facturaRepository.findAll();
    }
    
}

