/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10herencia;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author blasd
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomesticos> electroList = new ArrayList();
        //(Double pulgadas, boolean TDT, Double precio, String color, Integer peso, char Consumo)
        Televisor teve=new Televisor();
        Televisor teve1=new Televisor();
        teve.CrearTelevisor();
        teve1.CrearTelevisor();
       //Integer Carga, Double precio, String color, Integer peso, char Consumo
        Lavadora lava=new Lavadora();
        Lavadora lava1=new Lavadora();
        lava.CrearLavadora();
        lava1.CrearLavadora();
        
         electroList.add(teve);
         electroList.add(teve1);
         electroList.add(lava);
         electroList.add(lava1);
         double lavaPrecio=0;
         double tevePrecio=0;
         for (Electrodomesticos aux : electroList) {
             if (aux instanceof Televisor) {
                 Televisor object = (Televisor) aux;
                 tevePrecio+=aux.getPrecio();
                 
             }else{
                 lavaPrecio+=aux.getPrecio();
             }
        }
         System.out.println("Precio Lavarropas = "+lavaPrecio);
         System.out.println("Precio Televisores = "+tevePrecio);
         System.out.println("Precio Total = "+(lavaPrecio+tevePrecio));
    }
   
}
