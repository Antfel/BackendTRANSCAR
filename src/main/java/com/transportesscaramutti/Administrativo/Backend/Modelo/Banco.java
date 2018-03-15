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
@Table(name = "BANCO")
public class Banco {
    
    @Id
    @Column(name = "CODIGO_BANCO")
    private Integer codigoBanco;
    @Column(name = "NOMBRE_BANCO",length = 150)
    private String nombreBanco;
    @Column(name = "ABREVIATURA",length = 150)
    private String abreviatura;

    public Integer getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public String toString() {
        return "Banco{" + "codigoBanco=" + codigoBanco + ", nombreBanco=" + nombreBanco + ", abreviatura=" + abreviatura + '}';
    }
    
    
}
