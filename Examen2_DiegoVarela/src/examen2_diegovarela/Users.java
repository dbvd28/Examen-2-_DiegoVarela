/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_diegovarela;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Users implements Serializable{
    private int idusuario ;
    private String primnombre;
    private String segunnombre;
    private String apellido;
    private String segunapellido;
    private Date nacimiento;
    private Date afiliacion;
    private String contraseña;
  
private static final long SerialVersionUID = 777L;
    public Users(int idusuario, String primnombre, String segunnombre, String apellido, String segunapellido, Date nacimiento, Date afiliacion,String contraseña) {
        this.idusuario = idusuario;
        this.primnombre = primnombre;
        this.segunnombre = segunnombre;
        this.apellido = apellido;
        this.segunapellido = segunapellido;
        this.nacimiento = nacimiento;
        this.afiliacion = afiliacion;
        this.contraseña=contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getPrimnombre() {
        return primnombre;
    }

    public void setPrimnombre(String primnombre) {
        this.primnombre = primnombre;
    }

    public String getSegunnombre() {
        return segunnombre;
    }

    public void setSegunnombre(String segunnombre) {
        this.segunnombre = segunnombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegunapellido() {
        return segunapellido;
    }

    public void setSegunapellido(String segunapellido) {
        this.segunapellido = segunapellido;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Date getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(Date afiliacion) {
        this.afiliacion = afiliacion;
    }

   

    @Override
    public String toString() {
        return "Users{" + "primnombre=" + primnombre + ", apellido=" + apellido + '}';
    }
    
}
