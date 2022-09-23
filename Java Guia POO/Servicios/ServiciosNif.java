/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Nif;
import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ServiciosNif {
    Scanner leer=new Scanner(System.in);
    public Nif crearNif(){
        System.out.println("Ingrese su DNI");
        String dni=leer.nextLine();
        while(dni.length()!=8){
            System.out.println("DNI invalido, debe contener 8 digitos");
            System.out.println("Ingrese su DNI");
            dni=leer.nextLine();
        }
        int num = Integer.parseInt(dni);
        String nifArray[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","F"};
        String nif=nifArray[num%23];
        
        return new Nif(num,nif);
    }
    public void mostrarNif(Nif nif){
        System.out.println("Su nif es: "+nif.getDni()+"-"+nif.getNif());
    }
}
