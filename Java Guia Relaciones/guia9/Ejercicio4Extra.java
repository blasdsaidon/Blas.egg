/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;


import Servicios.Simulacion;

/**
 *
 * @author blasd
 */
public class Ejercicio4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulacion ps=new Simulacion();
        
        ps.crearAlumnos();
        ps.mostrarAlumnos();
        ps.votacion();
        System.out.println("------------------");
        ps.masVotados();
        ps.mostrarAlumnos();
    }
    
}
