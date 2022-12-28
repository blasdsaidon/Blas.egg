/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10herencia;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author blasd
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Edificio> edificios=new ArrayList();
       //String nombre, boolean techado, double alto, double ancho, double largo
        Polideportivo poli = new Polideportivo("Poli", true, 15, 30, 50);
        EdificioDeOficinas oficinas = new EdificioDeOficinas(0, 0, 0, 50, 30, 70);
        Polideportivo poli1 = new Polideportivo("Polilla", false, 10, 28, 70);
        EdificioDeOficinas oficinas1 = new EdificioDeOficinas(0, 0, 0, 70, 50, 80);
        edificios.add(oficinas);
        edificios.add(poli1);
        edificios.add(poli);
        edificios.add(oficinas1);
        int i = 0;
        for (Edificio aux : edificios) {
            aux.calcularSuperficie();
            aux.calcularVolumen();
            if (aux instanceof EdificioDeOficinas) {
                ((EdificioDeOficinas) aux).cantPersonas();
            }
            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).isTechado()) {
                    i++;
                }
            }
        }
        System.out.println("Polideportivos techados: " + i);
    }

}
