/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Servicios.ServiciosPuntos;
import entidades.Puntos;

/**
 *
 * @author blasd
 */
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPuntos sp1=new ServiciosPuntos();
        Puntos p1=sp1.crearPuntos();
        sp1.calcularDistancia(p1);
    }
    
}
