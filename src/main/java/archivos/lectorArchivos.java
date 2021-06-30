/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import Usuario.usuario;
/**
 *
 * @author alexis
 */
public class lectorArchivos {
 
   
    
       public ArrayList<usuario> leerUsuarios() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<usuario> usuarios = new ArrayList<>();
        File rutaUsuario = new File(EscritorArchivos.FILE_USUARIO);
        String[]  archivos=rutaUsuario.list();
        ObjectInputStream lector;   
        System.out.println("Archivos:"+archivos.length);
        for (int i = 0; i < archivos.length; i++) {
            String archivo = archivos[i];
            lector = new ObjectInputStream(new FileInputStream(EscritorArchivos.FILE_USUARIO+"/"+archivo));
            usuario u =(usuario)lector.readObject();
            usuarios.add(u);
            lector.close();
        }
        return usuarios;
    }
       
       public int tamArchivos(){
           int tam =0;
        ArrayList<usuario> usuarios = new ArrayList<>();
        File rutaUsuario = new File(EscritorArchivos.FILE_USUARIO);
        String[]  archivos=rutaUsuario.list();
        
        tam = archivos.length;
        return tam;   
       }
    
    
    
    
}
