/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import Servicios.ServiciosCadena;
import entidades.Cadena;

/**
 *
 * @author blasd
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosCadena sc = new ServiciosCadena();
        Cadena c1 = sc.crearCadena();
        System.out.println(c1.toString());
        sc.contarVocales(c1);
        sc.invertirFrase(c1);
        sc.vecesRepetido(c1);
        sc.unirFrases(c1);
        sc.reemplazar(c1);
        boolean contenido = sc.contieneLetra(c1);
        System.out.println(contenido);
    }

}
