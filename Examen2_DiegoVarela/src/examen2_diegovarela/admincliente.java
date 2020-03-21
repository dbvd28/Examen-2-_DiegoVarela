/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_diegovarela;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class admincliente {
     private ArrayList<cliente> clientes = new ArrayList();
    private File archivo = null;

    public admincliente(String path) {
        archivo = new File(path);
    }

    public ArrayList<cliente> getCliente() {
        return clientes;
    }

    public void setCliente(ArrayList<cliente> cliente) {
        this.clientes = cliente;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admincliente{" + "cliente=" + clientes + '}';
    }
    
     //extra mutador
    public void setPersona(cliente p) {
        this.clientes.add(p);
    }

    public void cargarArchivo() {
        try {
            clientes = new ArrayList();
            cliente temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (cliente) objeto.readObject()) != null) {
                        clientes.add(temp);
                    }
                } catch (EOFException E) {

                }
                entrada.close();
                objeto.close();
            }
        } catch (Exception e) {
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (cliente t : clientes) {
                bw.writeObject(t);
            }
            bw.flush();
            fw.close();
            bw.close();

        } catch (Exception e) {

        }
    }

}
