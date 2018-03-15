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
@Table(name = "CLIENTE")
public class Cliente {
    
    @Id
    @Column(name = "CODIGO_CLIENTE")
    private Integer codigoCliente;
    @Column(name = "RUC_CLIENTE",length = 11)
    private String rucCliente;
    @Column(name = "RAZON_CLIENTE",length = 400)
    private String razonCliente;
    @Column(name = "DIRECCION_CLIENTE")
    private String direccionCliente;
    @Column(name = "TELEFONO_CLIENTE")
    private String telefonoCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        this.rucCliente = rucCliente;
    }

    public String getRazonCliente() {
        return razonCliente;
    }

    public void setRazonCliente(String razonCliente) {
        this.razonCliente = razonCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + ", rucCliente=" + rucCliente + ", razonCliente=" + razonCliente + ", direccionCliente=" + direccionCliente + ", telefonoCliente=" + telefonoCliente + '}';
    }
    
}