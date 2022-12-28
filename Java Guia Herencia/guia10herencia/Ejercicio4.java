/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10herencia;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author blasd
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo cir=new Circulo(4);
        cir.calculoArea();
        cir.calculoPerimetro();
        Rectangulo rect=new Rectangulo(2,3);
        rect.calculoArea();
        rect.calculoPerimetro();
    }
    
}
