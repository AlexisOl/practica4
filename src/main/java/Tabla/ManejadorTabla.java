/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Usuario.usuario;
/**
 *
 * @author alexis
 */
public class ManejadorTabla {
      public static void llenarTabla(ArrayList<usuario> usuarios, JTable table) {
        DefaultTableModel modelo = new DefaultTableModel();
        table.setModel(modelo);
        //Anadir columnas
        modelo.addColumn("id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Color");
        modelo.addColumn("Partidas realizadas");
        modelo.addColumn("Partidas perdidas");
        modelo.addColumn("Partidas ganadas");
        for (usuario usuario : usuarios) {
            modelo.addRow(new Object[]{usuario.getId(),usuario.getNombre(),usuario.getApellido(),usuario.getPatidasjugadas(),usuario.getC(),usuario.getPartidasGanadas(),usuario.getPartidasPerdidas()});
        }

    }
}
