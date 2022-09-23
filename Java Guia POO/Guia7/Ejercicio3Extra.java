/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Servicios.ServiciosRaices;
import entidades.Raices;

/**
 *
 * @author blasd
 */
public class Ejercicio3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosRaices sr1 = new ServiciosRaices();
        Raices r1 = new Raices(1, 2, 5);
        sr1.getDiscriminante(r1);

        sr1.tieneRaices(r1);
        sr1.obtenerRaices(r1);
        sr1.obternerRaiz(r1);
        sr1.calcular(r1);
    }

}
