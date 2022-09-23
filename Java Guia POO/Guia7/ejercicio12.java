/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Servicios.ServiciosPersona12;
import entidades.Persona12;

/**
 *
 * @author blasd
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPersona12 sp1=new ServiciosPersona12();
        Persona12 p1= sp1.crearPersona();
        int edad=sp1.calcularEdad(p1);
        System.out.println("su edad es: "+edad+" años");
        sp1.menorQue(15, p1);
        sp1.mostrarPersona(p1);
        
        
        
    }
    
}
