/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Matematica;

/**
 *
 * @author blasd
 */
public class ServiciosMatematica {
    public void devolverMayor(Matematica matematica){
        
        if(matematica.getNum1()>matematica.getNum2()){
            System.out.println("el mayor numero es el num1--> "+matematica.getNum1());
             System.out.println("num2--> "+matematica.getNum2());
             matematica.setMayor(matematica.getNum1());
             matematica.setMenor(matematica.getNum2());
        }else if (matematica.getNum2()>matematica.getNum1()){
             System.out.println("el mayor numero es el num2--> "+matematica.getNum2());
              System.out.println(" num1--> "+matematica.getNum1());
              matematica.setMayor(matematica.getNum2());
              matematica.setMenor(matematica.getNum1());
        }
       
    }
    public void calcularPotencia(Matematica matematica){
        Double potencia=Math.pow(Math.round(matematica.getMayor()),Math.round(matematica.getMenor()));
        System.out.println(potencia);
                
    }
    public void calcularRaiz(Matematica matematica){
        double raiz=Math.sqrt(Math.abs(matematica.getMenor()));
        System.out.println(raiz);
    }
}
