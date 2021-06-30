/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;
import Dado.dado;
import Escalera.escalera;
import Serpiente.Serpiente;
import java.awt.Color;
import java.io.Serializable;
import javax.swing.JOptionPane;
/**
 *
 * @author alexis
 */
public class usuario implements Serializable {
 private static final long serialVersionUID = 1L;
    private int id;
    private String nombre;
    private String apellido;
    private int patidasjugadas;
    private int partidasGanadas;
    private int partidasPerdidas;
    private Color c;
    private int score;
    
    private int position;
    
    
    
    

    public usuario(int id, String nombre, String apellido, Color c) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.c = c;
    }

    
    
        @SuppressWarnings("static-access")
    public int play(int Customboardlength,int Customboardheight,Serpiente[] Snakes,escalera[] Ladders){
        int d=dado.Tiro();
        int a=this.position + d;       
        if(a<=Customboardlength*Customboardheight){
            if(Snakes[a-1]!=null){
                
                this.position=Snakes[a-1].cola;
                JOptionPane.showMessageDialog(null,"Una serpieente en la posicion: "+ Integer.toString(Snakes[a-1].boca)+" te atrapo");
            }
            else if(Ladders[a-1]!=null){
                this.position=Ladders[a-1].boca;
                JOptionPane.showMessageDialog(null,"Subes por medio de una escalera a la posicion: "+Integer.toString(Ladders[a-1].cola)+"!");
            }
            else this.position=a;
       } 
        this.partidasGanadas++;
        return d;
    }
    
    
    
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPatidasjugadas() {
        return patidasjugadas;
    }

    public void setPatidasjugadas(int patidasjugadas) {
        this.patidasjugadas = patidasjugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }
    
    
    
}
