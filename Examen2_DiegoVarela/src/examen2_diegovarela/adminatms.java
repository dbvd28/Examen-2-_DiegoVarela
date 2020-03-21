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
public class adminatms {
    private ArrayList<Atm> atms = new ArrayList();
    private File archivo = null;

    public adminatms(String path) {
        archivo = new File(path);
    } 

    public ArrayList<Atm> getAtms() {
        return atms;
    }

    public void setAtms(ArrayList<Atm> atms) {
        this.atms = atms;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminatms{" + "atms=" + atms + '}';
    }
  public void setPersona(Atm p) {
        this.atms.add(p);
    }

    public void cargarArchivo() {
        try {
            atms= new ArrayList();
            Atm temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Atm) objeto.readObject()) != null) {
                        atms.add(temp);
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
            for (Atm t : atms) {
                bw.writeObject(t);
            }
            bw.flush();
            fw.close();
            bw.close();

        } catch (Exception e) {

        }
    }
}
