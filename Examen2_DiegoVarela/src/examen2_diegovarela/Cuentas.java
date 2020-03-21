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
public class Cuentas implements Serializable {
    private int numcuenta;
    private int saldo;
    private int idusuario;
  private static final long SerialVersionUID = 777L;
  
    public Cuentas(int numcuenta, int saldo, int idusuario) {
        this.numcuenta = numcuenta;
        this.saldo = saldo;
        this.idusuario = idusuario;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public String toString() {
        return "saldo=" + saldo + ", idusuario=" + idusuario ;
    }
    
}
