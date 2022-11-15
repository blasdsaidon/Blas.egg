/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Entidades.Baraja;

/**
 *
 * @author blasd
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja b1=new Baraja();
        b1.llenarBaraja();
        b1.mezclar();
        b1.mostraBaraja();
       System.out.println("--------------");
       b1.repartirCartas();
       System.out.println("--------------");
       b1.cartasDisponibles();
       System.out.println("--------------");
       b1.cartasMonton();
       System.out.println("--------------");
       b1.mostraBaraja();
       
    }
    
}
