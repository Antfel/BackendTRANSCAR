/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transportesscaramutti.Administrativo.Backend.Service;

import com.transportesscaramutti.Administrativo.Backend.Modelo.Factura;
import java.util.List;

/**
 *
 * @author felix
 */
public interface FacturaService {
    Factura findByCodigoFactura(Integer codigoFactura);
    List<Factura> findAllFacturas();
}
