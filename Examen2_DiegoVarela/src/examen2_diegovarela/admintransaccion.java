/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_diegovarela;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class admintransaccion {
      private ArrayList<Transaccion> listatrans = new ArrayList();
    private File archivo = null;

    public admintransaccion(String path) {
        archivo = new File(path);
    }

    public ArrayList<Transaccion> getListatrans() {
        return listatrans;
    }

    public void setListatrans(ArrayList<Transaccion> listatrans) {
        this.listatrans = listatrans;
    }


    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admintransaccion{" + "listatrans=" + listatrans + '}';
    }

  
   public void settransaccion(Transaccion p) {
        this.listatrans.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Transaccion t : listatrans) {
                bw.write(t.getDescripcion()+ ";");
                bw.write(t.getId()+ ";");
                bw.write(t.getNumcuenta()+ ";");
                bw.write(t.getFecha()+ ";");
               
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listatrans = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listatrans.add(new Transaccion(sc.next(),
                            sc.next(),
                            sc.next(),sc.nextInt()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }  
}
