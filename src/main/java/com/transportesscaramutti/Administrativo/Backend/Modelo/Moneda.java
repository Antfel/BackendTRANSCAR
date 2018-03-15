/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transportesscaramutti.Administrativo.Backend.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author felix
 */
@Entity
@Table(name = "MONEDA")
public class Moneda {
    
    @Id
    @Column(name = "CODIGO_MONEDA")
    private Integer codigoMoneda;
    @Column(name = "DETALLE_MONEDA",length = 18)
    private String detalleMoneda;
    @Column(name = "SIMBOLO",length = 10)
    private String simbolo;

    public Integer getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(Integer codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getDetalleMoneda() {
        return detalleMoneda;
    }

    public void setDetalleMoneda(String detalleMoneda) {
        this.detalleMoneda = detalleMoneda;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "Moneda{" + "codigoMoneda=" + codigoMoneda + ", detalleMoneda=" + detalleMoneda + ", simbolo=" + simbolo + '}';
    }
    
}

