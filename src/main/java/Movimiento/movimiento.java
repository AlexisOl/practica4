/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimiento;

/**
 *
 * @author alexis
 */
public class movimiento {
    public int boca;
    public int cola;
    
    public movimiento(int boca,int cola){
        if(boca>cola){
            this.boca=boca;
            this.cola=cola;
        }
        else if(boca<cola){
            this.boca=cola;
            this.cola=boca;
        }
    }
}
