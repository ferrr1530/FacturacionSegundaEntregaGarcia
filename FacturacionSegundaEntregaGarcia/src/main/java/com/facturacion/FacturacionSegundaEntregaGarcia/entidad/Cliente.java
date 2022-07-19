package com.facturacion.FacturacionSegundaEntregaGarcia.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Column (name = "NRO CLIENTE")
    @Id
    private int nrocliente;

    @Column (name = "DNI")
    @Id
    private long dni;

    @Column (name = "NOMBRE")
    private String nombre;

    @Column (name = "APELLIDO")
    private String apellido;

    @Column(name = "DOMICILIO")
    private String domicilio;

    @Column (name = "TELEFONO")
    private int telefono;


    //Constructores

    public Cliente() {
    }

    public Cliente(int nrocliente, long dni, String nombre, String apellido, String domicilio, int telefono) {
        this.nrocliente = nrocliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }


    //Getters and Setters

    public int getNrocliente() {
        return nrocliente;
    }

    public void setNrocliente(int nrocliente) {
        this.nrocliente = nrocliente;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}




