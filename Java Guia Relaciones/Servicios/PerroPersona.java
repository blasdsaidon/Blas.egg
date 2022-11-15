/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class PerroPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Perro> perros = new ArrayList();
    ArrayList<Persona> personas = new ArrayList();
    ArrayList<Perro> perrosDados = new ArrayList();

    public void CrearPerro() {
        System.out.print("Introduzca el nombre de su perro: ");
        String nombre = leer.next().toLowerCase();
        System.out.print("Introduzca el nombre de la raza del perro: ");
        String raza = leer.next().toLowerCase();
        System.out.print("Introduzca la edad del perro: ");
        Integer edad = leer.nextInt();
        System.out.print("Introduzca el tamaño del perro: ");
        Double tamanio = leer.nextDouble();
        System.out.println("");

        Perro p1=new Perro();
        p1.setNombre(nombre);
        p1.setEdad(edad);
        p1.setRaza(raza);
        p1.setTamanio(tamanio);
        perros.add(p1);

        System.out.println("Ingrese otro perro? S = si o N = no");
        String opcion = leer.next();
        if (opcion.equalsIgnoreCase("S")) {
            CrearPerro();
        }
        System.out.println("");
    }

    public void CrearPersona() {
        System.out.print("Introduzca su nombre: ");
        String nombre = leer.next().toLowerCase();
        System.out.print("Introduzca su apellido: ");
        String apellido = leer.next().toLowerCase();
        System.out.print("Introduzca su edad: ");
        Integer edad = leer.nextInt();
        System.out.print("Introduzca su numero de DNI: ");
        Integer documento = leer.nextInt();
        System.out.print("Introduzca el nombre de su perro para buscarlo: ");
        String nombrePerro = leer.next();
        System.out.println("");

        Persona p1 = new Persona();
        p1.setNombre(nombre);
        p1.setApellido(apellido);
        p1.setEdad(edad);
        p1.setDocumento(documento);
        boolean busqueda = false;
        for (Perro perro : perros) {
            if (nombrePerro.equalsIgnoreCase(perro.getNombre())) {
                if (!perrosDados.contains(perro)) {
                    perrosDados.add(perro);
                    p1.setPerro(perro);
                    busqueda = true;
                    break;
                   //System.out.println("Su perro fue encontrado!");
            } else {
                    System.out.println("El perro ya fue adoptado, vuelva cuando tengamos otro: " + nombrePerro);
                }
        }
        }
            
        if (!busqueda) {
            System.out.println("El perro no fue encontrado...");
        }
        personas.add(p1);

        System.out.println("Ingresa otra persona? S = si o N = no");
        String opcion = leer.next();
        if (opcion.equalsIgnoreCase("S")) {
            CrearPersona();
        }
    }
    
        public void MostrarPersona() {
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        }
}

