/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_diegovarela;

import java.util.Date;

/**
 *
 * @author diego
 */
public class Log {
    private String nombre;
    private String accion;
    private String realizo;

    public Log(String nombre, String accion, String realizo) {
        this.nombre = nombre;
        this.accion = accion;
        this.realizo = realizo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getRealizo() {
        return realizo;
    }

    public void setRealizo(String realizo) {
        this.realizo = realizo;
    }

    @Override
    public String toString() {
        return "Log{" + "accion=" + accion + '}';
    }
    
}
