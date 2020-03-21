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
public class adminmanten {
     private ArrayList<Mantenimiento> mantens = new ArrayList();
    private File archivo = null;

    public adminmanten(String path) {
        archivo = new File(path);
    } 

    public ArrayList<Mantenimiento> getMantens() {
        return mantens;
    }

    public void setMantens(ArrayList<Mantenimiento> mantens) {
        this.mantens = mantens;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminmanten{" + "mantens=" + mantens + '}';
    }
     public void setPersona(Mantenimiento p) {
        this.mantens.add(p);
    }

    public void cargarArchivo() {
        try {
            mantens = new ArrayList();
            Mantenimiento temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Mantenimiento) objeto.readObject()) != null) {
                        mantens.add(temp);
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
            for (Mantenimiento t : mantens) {
                bw.writeObject(t);
            }
            bw.flush();
            fw.close();
            bw.close();

        } catch (Exception e) {

        }
    }
}
