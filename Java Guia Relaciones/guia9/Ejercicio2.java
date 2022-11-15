/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;

/**
 *
 * @author blasd
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego j1=new Juego();
        Jugador jug1=new Jugador();
        Revolver re1=new Revolver();
        
       // re1.llenarRevolver();
        j1.llenarJuego(re1, jug1);
        j1.ronda();
    }
    
}
