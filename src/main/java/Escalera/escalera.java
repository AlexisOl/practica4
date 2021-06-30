/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escalera;

import Movimiento.movimiento;
import Usuario.usuario;

/**
 *
 * @author alexis
 */
public class escalera extends movimiento {
       public escalera(int boca,int cola)
    {
        super(boca,cola);
    }
    public void climb(usuario p)
    {
        if(p.getPosition()==this.cola)
        {
            p.setPosition(this.boca);
        }
    }   
}
