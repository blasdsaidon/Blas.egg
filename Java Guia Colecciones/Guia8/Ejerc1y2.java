/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class Ejerc1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> mascotas=new ArrayList<>();
        
        Scanner leer=new Scanner(System.in);
        int opcion=1;
        while(opcion!=2){
            System.out.println("Opción 1 ingresar raza, Opción 2 salir");
            opcion=leer.nextInt();
            if(opcion==1){
              System.out.println("ingrese raza"); 
              String m=leer.next();
              mascotas.add(m);
                
                }
            }
        for (String var : mascotas) {
                    System.out.println(var);
        }
        Iterator<String> iter = mascotas.iterator();
        System.out.println("Ingrese una raza a borrar");
       String borrar=leer.next();
        System.out.println("-------");
       
        while(iter.hasNext()){
            if(iter.next().equals(borrar)){
            iter.remove();
            }
        }
        for (String var : mascotas) {
                    System.out.println(var);
        }
        
        }
    }
    

