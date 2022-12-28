/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11excepciones;

import Entidades.IronArmadura;
import Servicios.ServiciosIronMan;

/**
 *
 * @author blasd
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosIronMan armadura=new ServiciosIronMan();
        armadura.crearArmadura();
//        armadura.caminar();
        armadura.MostrarEstado();
    }
    
}
