/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_diegovarela;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Atm implements Serializable {

    private String ubicacion;
    private int id;
    private Date Fabricacion;
    private String Mantenimiento;
    private int saldo;
    private static final long SerialVersionUID = 777L;

    public Atm(String ubicacion, int id, Date Fabricacion, String Mantenimiento) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.Fabricacion = Fabricacion;
        this.Mantenimiento = Mantenimiento;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFabricacion() {
        return Fabricacion;
    }

    public void setFabricacion(Date Fabricacion) {
        this.Fabricacion = Fabricacion;
    }

    public String getMantenimiento() {
        return Mantenimiento;
    }

    public void setMantenimiento(String Mantenimiento) {
        this.Mantenimiento = Mantenimiento;
    }

    @Override
    public String toString() {
        return "Atm{" + "ubicacion=" + ubicacion + '}';
    }

}
