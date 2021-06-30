/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author alexis
 */
public class lectortexto {
    
    
      public ArrayList<Object> leerFichero(File archivo,JTextArea text) throws FileNotFoundException, IOException {
        ArrayList<Object> vehiculos = new ArrayList<>();
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
         //   String[] campos=separarCampostablero(linea);
        //    Object vehiculo=.construirVehiculo(campos);
         //   if(vehiculo!=null){
            //    vehiculos.add(vehiculo);
            }
            text.append("\n"+linea);
      //  }
        fr.close(); 
        return vehiculos;
    }

        private String[] separarCampostablero (String linea) {
        String inicioVehiculo = "tablero(";
        String lineaDeCampos = linea.substring(inicioVehiculo.length(), linea.length() - 2);
        System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }
        
        
         
  
    
}
