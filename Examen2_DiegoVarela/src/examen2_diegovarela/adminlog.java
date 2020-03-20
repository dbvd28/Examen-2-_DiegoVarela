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
public class adminlog {
     private ArrayList<Log> listalog = new ArrayList();
    private File archivo = null;

    public adminlog(String path) {
        archivo = new File(path);
    }

    public ArrayList<Log> getListalog() {
        return listalog;
    }

    public void setListalog(ArrayList<Log> listalog) {
        this.listalog = listalog;
    }


    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminlog{" + "listalog=" + listalog + '}';
    }

   
   public void setlog(Log p) {
        this.listalog.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Log t : listalog) {
                bw.write(t.getAccion()+ ";");
                bw.write(t.getRealizo()+ ";");
                bw.write(t.getNombre()+ ";");
               
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listalog = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listalog.add(new Log(sc.next(),
                            sc.next(),
                            sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }  
}
