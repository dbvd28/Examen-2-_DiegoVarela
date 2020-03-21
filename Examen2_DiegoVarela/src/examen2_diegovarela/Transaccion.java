/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_diegovarela;

import java.io.Serializable;


/**
 *
 * @author diego
 */
public class Transaccion implements Serializable {
    private String numcuenta;
    private String descripcion;
    private String fecha;
    private int id;
private static final long SerialVersionUID = 777L;

    public Transaccion(String numcuenta, String descripcion, String fecha, int id) {
        this.numcuenta = numcuenta;
        this.descripcion = descripcion;
        this.fecha = fecha;
        setId(id);
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id!=this.id){
        this.id = id;
        }
    }

    @Override
    public String toString() {
        return "Transaccion{" + "numcuenta=" + numcuenta + ", id=" + id + '}';
    }
    
}
