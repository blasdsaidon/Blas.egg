/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8;

import Servicios.ServiciosPelicula;



/**
 *
 * @author blasd
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPelicula sp=new ServiciosPelicula();
        sp.ingresarPeliculaSinScanner();
        sp.mostrarPeliculas();
       
        sp.mostrarPeliLarga();
        
       sp.ordenarDirector();
       
        sp.ordenarDuracionAscendente();
      
        sp.ordenarDuracionDescendente();
        
       sp.ordenarTitulo();
    }
    
}
