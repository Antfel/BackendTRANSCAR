/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transportesscaramutti.Administrativo.Backend.Modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author felix
 */

@Entity
@Table(name = "FACTURA")
public class Factura {
    
    @Id
    @Column(name = "CODIGO_FACTURA")
    private Integer codigoFactura;
    @Column(name = "SERIE_FACTURA",length = 11)
    private String serieFactura;
    @Column(name = "NUMERO_FACTURA",length = 11)
    private String numeroFactura;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CODIGO_CLIENTE")
    private Cliente cliente;
    @Column(name = "SUBTOTAL",length = 12,precision = 2)
    private Double subtotal;
    @Column(name = "IGV",length = 12,precision = 2)
    private Double igv;
    @Column(name = "TOTAL_FACTURA",length = 12,precision = 2)
    private Double totalFactura;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CODIGO_MONEDA")
    private Moneda moneda;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CODIGO_ESTADO")
    private Estado estado;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_FACTURA")
    private Date fechaFactura;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_PAGO")
    private Date fechaPago;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_RECEPCION")
    private Date fechaRecepcion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_VENCIMIENTO")
    private Date fechaVencimiento;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_COMPROMISO")
    private Date fechaCompromiso;
    @Column(name = "PORCENTAJE_DETRACCION",length = 12,precision = 2)
    private Double procentajeDetraccion;
    @Column(name = "MONTO_DETRACCION",length = 12,precision = 2)
    private Double montDetraccion;

    public Integer getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(Integer codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getSerieFactura() {
        return serieFactura;
    }

    public void setSerieFactura(String serieFactura) {
        this.serieFactura = serieFactura;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public Double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(Double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaCompromiso() {
        return fechaCompromiso;
    }

    public void setFechaCompromiso(Date fechaCompromiso) {
        this.fechaCompromiso = fechaCompromiso;
    }

    public Double getProcentajeDetraccion() {
        return procentajeDetraccion;
    }

    public void setProcentajeDetraccion(Double procentajeDetraccion) {
        this.procentajeDetraccion = procentajeDetraccion;
    }

    public Double getMontDetraccion() {
        return montDetraccion;
    }

    public void setMontDetraccion(Double montDetraccion) {
        this.montDetraccion = montDetraccion;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigoFactura=" + codigoFactura + ", serieFactura=" + serieFactura + ", numeroFactura=" + numeroFactura + ", cliente=" + cliente + ", subtotal=" + subtotal + ", igv=" + igv + ", totalFactura=" + totalFactura + ", moneda=" + moneda + ", estado=" + estado + ", fechaFactura=" + fechaFactura + ", fechaPago=" + fechaPago + ", fechaRecepcion=" + fechaRecepcion + ", fechaVencimiento=" + fechaVencimiento + ", fechaCompromiso=" + fechaCompromiso + ", procentajeDetraccion=" + procentajeDetraccion + ", montDetraccion=" + montDetraccion + '}';
    }

}
