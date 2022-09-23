/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Servicios.ServiciosMatematica;
import entidades.Matematica;

/**
 *
 * @author blasd
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServiciosMatematica sm = new ServiciosMatematica();
        Matematica n1=new Matematica();
        
       n1.setNum1(Math.random()*10);
      n1.setNum2(Math.random()*10);
        //System.out.println(n1.getNum1()+" "+n1.getNum2());
        sm.devolverMayor(n1);
        sm.calcularPotencia(n1);
        sm.calcularRaiz(n1);
    }
    
}
