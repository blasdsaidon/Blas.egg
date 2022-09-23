/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Servicios.ServiciosNif;
import entidades.Nif;

/**
 *
 * @author blasd
 */
public class Ejercicio4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosNif sn1=new ServiciosNif();
        Nif n1=sn1.crearNif();
        sn1.mostrarNif(n1);
    }
    
}
