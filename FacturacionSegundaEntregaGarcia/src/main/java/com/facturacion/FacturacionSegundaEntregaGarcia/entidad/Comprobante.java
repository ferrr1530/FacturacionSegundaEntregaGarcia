package com.facturacion.FacturacionSegundaEntregaGarcia.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "COMPROBANTE")
public class Comprobante {

    @Column(name = "ID COMPROBANTE")
    @Id
    private int id_comprobante;

    @Column (name = "FECHA")
    private Date fecha;

    @Column (name = "CANTIDAD")
    private int cantidad;

    @Column (name = "TOTAL")
    private float total;

    @Column(name = "ID CLIENTE")
    private int id_cliente;

    //Constructores

    public Comprobante() {
    }

    public Comprobante(int id_comprobante, Date fecha, int cantidad, float total, int id_cliente) {
        this.id_comprobante = id_comprobante;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.total = total;
        this.id_cliente = id_cliente;
    }

    //Getters and Setters

    public int getId_comprobante() {
        return id_comprobante;
    }

    public void setId_comprobante(int id_comprobante) {
        this.id_comprobante = id_comprobante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    //Actualizar, Modificar y Crear

}
