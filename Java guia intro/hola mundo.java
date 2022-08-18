/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("escriba su nombre");
        nombre = leer.next();
        System.out.println("mi nombre es " + nombre + " y no entiendo un sotto");
    }
    
}
