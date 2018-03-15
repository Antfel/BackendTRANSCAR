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
@Table(name = "ESTADO")
public class Estado {
    
    @Id
    @Column(name = "CODIGO_ESTADO")
    private Integer codigoEstado;
    @Column(name = "TIPO_ESTADO")
    private Integer tipoServicio;
    @Column(name = "DESCRIPCION",length = 50)
    private String descripcion;
    @Column(name = "DETALLE_ESTADO",length = 50)
    private String detalleEstado;
    @Column(name = "DETALLE_ESTADO_COMPLETO",length = 100)
    private String detalleEstadoCompleto;

    public Integer getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(Integer codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public Integer getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(Integer tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalleEstado() {
        return detalleEstado;
    }

    public void setDetalleEstado(String detalleEstado) {
        this.detalleEstado = detalleEstado;
    }

    public String getDetalleEstadoCompleto() {
        return detalleEstadoCompleto;
    }

    public void setDetalleEstadoCompleto(String detalleEstadoCompleto) {
        this.detalleEstadoCompleto = detalleEstadoCompleto;
    }

    @Override
    public String toString() {
        return "Estado{" + "codigoEstado=" + codigoEstado + ", tipoServicio=" + tipoServicio + ", descripcion=" + descripcion + ", detalleEstado=" + detalleEstado + ", detalleEstadoCompleto=" + detalleEstadoCompleto + '}';
    }

}