/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Servicios.ServiciosCine;

/**
 *
 * @author blasd
 */
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosCine sc=new ServiciosCine();
        sc.abrirCine();
        
        //sc.crearEspectador();
        
        sc.llenarCine();
        sc.mostrarSala();
    }
    
}
