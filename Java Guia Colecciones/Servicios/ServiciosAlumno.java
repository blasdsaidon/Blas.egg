/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ServiciosAlumno {
     private ArrayList<Alumno> listaAlumno=new ArrayList<>();
    
    private Scanner leer=new Scanner(System.in);
    
    public void crearAlumno(){
        Alumno alumnoAux=new Alumno();
        ArrayList<Integer> listaNotas=new ArrayList<>();
        System.out.println("ingrese nombre de alumno");
        alumnoAux.setNombreAlumno(leer.next());
        System.out.println("ingrese 1° nota de "+alumnoAux.getNombreAlumno());
        listaNotas.add(leer.nextInt());
        System.out.println("ingrese 2° nota de "+alumnoAux.getNombreAlumno());
        listaNotas.add(leer.nextInt());
        System.out.println("ingrese 3° nota de "+alumnoAux.getNombreAlumno());
        listaNotas.add(leer.nextInt());
        alumnoAux.setNotas(listaNotas);
        listaAlumno.add(alumnoAux);
    }
    
    public void mostrarAlumnos(){
        for (Alumno aux: listaAlumno){
            System.out.println(aux.getNombreAlumno()+" "+aux.getNotas());
        }
    
}
    public void crearAlumnos(){
        int opcion=1;
//        System.out.println("ingrese 1 para agregar alumno y 2 para salir");
//            opcion=leer.nextInt();
        while(opcion!=2){
            
            System.out.println("ingrese 1 para agregar alumno y 2 para salir");
            opcion=leer.nextInt();
            if(opcion==1){
                crearAlumno();
//            }else{
//                continue;
//            }
            }     
        }
        
    }
    public void calcularNota(){
        Iterator<Alumno> iter= listaAlumno.iterator();
        System.out.println("Ingrese nombre del alumno para obtener su nota final");
        String nombre=leer.next();
        System.out.println("-------");
       
        while(iter.hasNext()){
            if(iter.next().getNombreAlumno().equalsIgnoreCase(nombre)){
                double suma=0;
                
                for (Integer nota : iter.next().getNotas()) {
                    //System.out.println("nota: " +nota);
                    suma=nota+suma;
                }
                System.out.println("Nota final de "+nombre +" es "+ suma/3);

            } else{
                System.out.println("el nombre no corresponde a un alumno de la lista");
       
                }
        
    }
    }
    public void calcularNotaNoIter(){
       System.out.println("Ingrese nombre del alumno para obtener su nota final");
       String nombre=leer.next();
       boolean existe=false;
       for (Alumno aux: listaAlumno){
           if(aux.getNombreAlumno().equalsIgnoreCase(nombre)){
               existe=true;
               double suma=0;
               for(int nota:aux.getNotas()){
                   suma=suma+nota;
               }
               System.out.println("Nota final de "+nombre +" es "+ suma/3);
           }
              
            
           }
       if(!existe){
                  System.out.println("el nombre no corresponde a un alumno de la lista");
              } 
       }
}
