/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10herencia;

import Entidades.AlquilerBarco;
import Entidades.BarcosMotor;
import Entidades.Veleros;

import Entidades.Yates;

/**
 *
 * @author blasd
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Yates yate=new Yates(150, 15, 1995, 15.8, "ABC123");
        Veleros velereo=new Veleros(5, 1985, 10.5, "FAC859");
        BarcosMotor motoBarco=new BarcosMotor(200, 1985, 5.5, "ABC751");
        
        AlquilerBarco barquito = new AlquilerBarco();
        barquito.precioAlquiler(motoBarco);
    }
    
}
