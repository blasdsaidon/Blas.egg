/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ServiciosPuntos {
     Scanner leer=new Scanner(System.in);
   public Puntos crearPuntos(){
       System.out.println("ingrese la coordenada x1");
        double x1 = leer.nextDouble();
        System.out.println("ingrese la coordenada y1");
        double y1 = leer.nextDouble();
        System.out.println("ingrese la coordenada x2");
        double x2 = leer.nextDouble();
        System.out.println("ingrese la coordenada y2");
        int y2 = leer.nextInt();
        return new Puntos(x1,y1,x2,y2);
       
   }
       public void calcularDistancia(Puntos punto){
           double distancia=Math.sqrt(Math.pow(punto.getX2()-punto.getX1(),2)+Math.pow(punto.getY2()-punto.getY1(),2));
           System.out.println("La distancia entre los puntos es "+distancia); 
       }    
}
