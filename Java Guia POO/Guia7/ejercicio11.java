/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el año");
        int anio=leer.nextInt();
        System.out.println("ingrese el mes");
        int mes=leer.nextInt();
        System.out.println("ingrese el dia");
        int dia=leer.nextInt();
        Date fecha=new Date(anio-1900,mes-1,dia);
        Date fechaActual=new Date();
        
        int diferencia = fechaActual.getYear()-fecha.getYear();
        
        if ((fecha.getMonth()>fechaActual.getMonth()) || (fecha.getMonth()==fechaActual.getMonth() && fecha.getDate()>fechaActual.getDate())){
            diferencia = diferencia - 1;
        }
        System.out.println("su edad es: "+diferencia+" años");
    }
    
}
