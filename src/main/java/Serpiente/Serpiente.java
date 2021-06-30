/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serpiente;

import Movimiento.movimiento;
import Usuario.usuario;

/**
 *
 * @author alexis
 */
public class Serpiente extends movimiento{
    
     
    public Serpiente(int boca,int cola){
        super(boca,cola);
    }
    
    public void eat(usuario p)
    {
        if(p.getPosition()==this.boca)
        {
            p.setPosition(this.cola);
        }
    }
    
}
