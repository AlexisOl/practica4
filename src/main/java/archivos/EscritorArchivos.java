/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Usuario.usuario;
/**
 *
 * @author alexis
 */
public class EscritorArchivos {
    
    
    public static final String  FILE_USUARIO= new String("src/binarios/usuarios");
       public void guardarVehiculo(ArrayList<usuario> usuario) throws IOException,FileNotFoundException{
        FileOutputStream fileOutput; 
        ObjectOutputStream salida;
        for (usuario usuarios : usuario) {
            fileOutput = new FileOutputStream(FILE_USUARIO+"/"+usuarios.getNombre());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(usuarios);
            salida.close();
        }
    }
    
}
