/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10herencia;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author blasd
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich", "carne", "doberman", 15);
        perro1.Alimentarse();
        System.out.println("");
        Animal perro2 = new Perro("Teddy", "Croquetas","Chihuahua",10);
        perro2.Alimentarse();
        System.out.println("");
        Animal gato1 = new Gato("Pelusa", "Galletas", "Siames",15);
        gato1.Alimentarse();
        System.out.println("");
        Animal caballo1 = new Caballo("Spark", "Partes de Pasto", "Fino",25);
        caballo1.Alimentarse();
        System.out.println("");
    }

    }
    

