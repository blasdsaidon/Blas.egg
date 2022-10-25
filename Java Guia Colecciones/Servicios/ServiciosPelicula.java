/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import Comparadores.ComparadoresPelicula;

/**
 *
 * @author blasd
 */
public class ServiciosPelicula {
    private ArrayList<Pelicula> listaPeliculas=new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    public void ingresarPelicula(){
        Pelicula peliculaAux=new Pelicula();
        System.out.println("ingrese Nombre Pelicula");
        peliculaAux.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula");
        peliculaAux.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la pelicula en minutos");
        peliculaAux.setDuracion(leer.nextInt());
        listaPeliculas.add(peliculaAux);
        System.out.println("¿desea agregar otra pelicula? (S/N)");
        String opc=leer.next();
        
        if(opc.equalsIgnoreCase("s")){
            ingresarPelicula();
        }
        
    }
    public void ingresarPeliculaSinScanner(){
        String titulo1="KarateKid";
        
        String titulo2="Piratas del Caribe";
        String titulo3="Zombies atacan";  
        String titulo4="Carbonero";
        Integer duracion1=78;
        Integer duracion2=45;
        Integer duracion3=123;
        Integer duracion4=45;
        String director1="Miyagi";
        String director2="Barba Azul";
        String director3="Robert";
        String director4="Zabaleta";
        Pelicula p1=new  Pelicula(titulo1,director1,duracion1);
        Pelicula p2=new  Pelicula(titulo2,director2,duracion2);
        Pelicula p3=new  Pelicula(titulo3,director3,duracion3);
        Pelicula p4=new  Pelicula(titulo4,director4,duracion4);
        listaPeliculas.add(p1);
        listaPeliculas.add(p2);
        listaPeliculas.add(p3);
        listaPeliculas.add(p4);
    }
    public void mostrarPeliculas(){
        System.out.println("Todas las pelis");
        System.out.println("-------------");
        for (Pelicula peliculas : listaPeliculas) {
            System.out.println(peliculas);
            
        }
    }
    public void mostrarPeliLarga(){
        System.out.println("Pelis de mas de 1 hora");
        System.out.println("-------------");
         for (Pelicula peliculas : listaPeliculas) {
            if(peliculas.getDuracion()>60){
            System.out.println(peliculas);
         }
         }
    }
    public void ordenarTitulo(){
        listaPeliculas.sort(ComparadoresPelicula.tituloAlfabetico);
        System.out.println("Pelis ordenadas por titulo");
        System.out.println("-------------");
        for (Pelicula aux : listaPeliculas) {
          System.out.println(aux);  
        }
        
    }
    public void ordenarDuracionAscendente(){
     listaPeliculas.sort(ComparadoresPelicula.duracionAscendente); 
        
     System.out.println("Pelis de menor a mayor duracion");
        System.out.println("-------------");
     for (Pelicula aux : listaPeliculas) {
          System.out.println(aux);  
        }
    }
    public void ordenarDuracionDescendente(){
        listaPeliculas.sort(ComparadoresPelicula.duracionDesscendente); 
        System.out.println("Pelis de mayor a menor duracion");
        System.out.println("-------------");
     for (Pelicula aux : listaPeliculas) {
          System.out.println(aux);  
        }
    }
    public void ordenarDirector(){
        listaPeliculas.sort(ComparadoresPelicula.directorAlfabetico); 
        System.out.println("Pelis ordenadas por director");
        System.out.println("-------------");
     for (Pelicula aux : listaPeliculas) {
          System.out.println(aux);  
        }
    }
}
