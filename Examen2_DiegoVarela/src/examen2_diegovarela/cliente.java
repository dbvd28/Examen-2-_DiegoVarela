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
public class cliente extends Users implements Serializable{
    private ArrayList<Cuentas> listacuentas=new ArrayList();
private static final long SerialVersionUID = 777L;
  private ArrayList <Transaccion> transacciones=new ArrayList();
    public cliente(int idusuario, String primnombre, String segunnombre, String apellido, String segunapellido, Date nacimiento, Date afiliacion, String contraseña) {
        super(idusuario, primnombre, segunnombre, apellido, segunapellido, nacimiento, afiliacion, contraseña);
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

   

    public ArrayList<Cuentas> getListacuentas() {
        return listacuentas;
    }

    public void setListacuentas(ArrayList<Cuentas> listacuentas) {
        this.listacuentas = listacuentas;
    }
  
    
}
