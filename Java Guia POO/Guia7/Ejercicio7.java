/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import entidades.Persona;
import java.util.LinkedList;



/**
 *
 * @author blasd
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int i=0,j=0,k=0,l=0;
         LinkedList<Persona> li = new LinkedList<>();
        Persona p1=new Persona(78, 1.588, 45, "master", "h");
       // p1.crearPersona();
        int retorno=p1.calcularIMC();
        boolean mayor=p1.mayorEdad();
        switch (retorno) {
            case 1:
                i++;
                break;
            case 0:
                j++;
                break;
            default:
                k++;
                break;
        }
        if (mayor==true){
            l++;
        }
        
            
        Persona p2=new Persona(78, 1.85, 15, "lauro", "o");
       // p2.crearPersona();
         retorno=p2.calcularIMC();
         mayor=p2.mayorEdad();
        switch (retorno) {
            case 1:
                i++;
                break;
            case 0:
                j++;
                break;
            default:
                k++;
                break;
        }
        if (mayor==true){
            l++;
        }
        Persona p3=new Persona(152, 1.98, 13, "nombre", "m");
       // p3.crearPersona();
          retorno=p3.calcularIMC();
         mayor=p3.mayorEdad();
        switch (retorno) {
            case 1:
                i++;
                break;
            case 0:
                j++;
                break;
            default:
                k++;
                break;
        }
        if (mayor==true){
            l++;
        }
        Persona p4=new Persona(40, 1.58, 15, "miguel", "m");
        //p4.crearPersona();
         retorno=p4.calcularIMC();
        mayor=p4.mayorEdad();
        switch (retorno) {
            case 1:
                i++;
                break;
            case 0:
                j++;
                break;
            default:
                k++;
                break;
        }
        if (mayor==true){
            l++;
        }
        
        

         System.out.println(i);
           System.out.println("porcentaje de sobrepeso: %"+ ((double)i/4)*100);
           System.out.println("porcentaje peso ideal: %"+((double)j/4)*100);
           System.out.println("porcentaje por debajo del peso ideal: %"+((double)k/4)*100);
           System.out.println("porcentaje de mayores de edad: %"+((double)l/4)*100);
        }
        
    }
    

