/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dado;

/**
 *
 * @author alexis
 */
public class dado {
      public static int Tiro(){
        return ((int)(Math.random()*109987))%6 + 1;
    }
}
