/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import entidades.Pais;
import java.util.Iterator;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author blasd
 */
public class ServiciosPais {
    private Set<Pais> listaPais=new TreeSet<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
   public void agregarPais(){
       Pais p1=new Pais();
       System.out.println("Ingrese un pais");
       p1.setPais(leer.next());
       System.out.println("Ingrese habitantes");
       p1.setHabitantes(leer.nextInt());
       listaPais.add(p1);
       System.out.println("¿Agregar otro pais S/N?");
       String opcion=leer.next();
       if(opcion.equalsIgnoreCase("s")){
           agregarPais();
       }
       
   }
   public void mostrarPais(){
       for (Pais listaPai : listaPais) {
           System.out.println(listaPai);
       }
   }
    public void eliminarPais(){
        Iterator<Pais> iterador = listaPais.iterator();
        System.out.println("Ingrese un pais a borrar");
       String borrar=leer.next();
        System.out.println("-------");
        boolean esta=false;
        while(iterador.hasNext()){
           
            if(iterador.next().getPais().equals(borrar)){
            iterador.remove();
                System.out.println("Se elimino exitosamente");
                mostrarPais();
                esta=true;
            }
            
        }
        if(!esta){
                System.out.println("El pais a eliminar no se ecuentra en la lista");
            }
    }
}
