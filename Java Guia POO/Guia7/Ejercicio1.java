//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.
package Guia7;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner numer = new Scanner(System.in);
        Libro l1 = new Libro();
        System.out.println("Ingrese ISBN");
        l1.setISBN(leer.nextLine());
        System.out.println("Ingrese Autor");
        l1.setAutor(leer.nextLine());
        System.out.println("Ingrese Titulo");
        l1.setTitulo(leer.nextLine());
        System.out.println("Ingrese número de páginas");
        l1.setPaginas(numer.nextInt());leer.nextLine();
        
        System.out.println(l1.toString());   
    }
    
}
