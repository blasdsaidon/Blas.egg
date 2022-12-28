/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalDeServicio;
import Entidades.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ServiciosFacultad {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    List<Persona> personas = new ArrayList();

    public void CrearListado() {

        Estudiante jero = new Estudiante("Programacion", "Jero", "Basso", 150959, "Soltero");
        Estudiante pablo = new Estudiante("Programacion", "Pablo", "Caporicci", 746154, "casado");
        Estudiante damian = new Estudiante("Programacion", "Damian", "Martinez", 7828484, "Comprometido");
        Profesor carlos = new Profesor("Lenguaje", 2015, 495, "Carlos", "Balmaseda", 848583, "Casado");
        PersonalDeServicio gladis = new PersonalDeServicio("Conserje", 2020, 949, "Gladis", "Bermejo", 949592, "Soltero");

        personas.add(jero);
        personas.add(pablo);
        personas.add(damian);
        personas.add(carlos);
        personas.add(gladis);

        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void cambiarEstadoCivil() {
        System.out.println("Ingrese el nombre a buscar");
        String nombre = leer.nextLine();
        int i = 0;
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese el nuevo estado civil");
                persona.setEstadoCivil(leer.nextLine());
                System.out.println(persona);
                i++;
                break;
            }
        }
        if (i == 0) {
            System.out.println("No se encontró el nombre en la lista");

        }
    }

    public void cambiarDespacho() {
        System.out.println("Ingrese el nombre a buscar");
        String nombre = leer.nextLine();
        int i = 0;
        for (Persona persona : personas) {
            if (persona instanceof Empleado) {
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Ingrese el nuevo despacho");
                    ((Empleado) persona).setDespacho(leer.nextInt());
                    System.out.println(persona);
                    i++;
                    break;
                }

            }

        }
        if (i == 0) {
            System.out.println("No se encontró el nombre en la lista");
        }
    }

    public void matricularAlumno() {
        System.out.println("Ingrese el nombre a buscar");
        String nombre = leer.nextLine();
        int i = 0;
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Ingrese el nuevo curso");
                    ((Estudiante) persona).setCurso(leer.nextLine());
                    System.out.println(persona);
                    i++;
                    break;
                }

            }

        }
        if (i == 0) {
            System.out.println("No se encontró el nombre en la lista");
        }
    }

    public void cambioDepartamento() {
        System.out.println("Ingrese el nombre a buscar");
        String nombre = leer.nextLine();
        int i = 0;
        for (Persona persona : personas) {
            if (persona instanceof Profesor) {
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Ingrese el nuevo departamento");
                    ((Profesor) persona).setDepartamento(leer.nextLine());
                    System.out.println(persona);
                    i++;
                    break;
                }

            }

        }
        if (i == 0) {
            System.out.println("No se encontró el nombre en la lista");
        }
    }
  public void cambioSeccion() {
        System.out.println("Ingrese el nombre a buscar");
        String nombre = leer.nextLine();
        int i = 0;
        for (Persona persona : personas) {
            if (persona instanceof PersonalDeServicio) {
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Ingrese la nueva seccion");
                    ((PersonalDeServicio) persona).setSeccion(leer.nextLine());
                    System.out.println(persona);
                    i++;
                    break;
                }

            }

        }
        if (i == 0) {
            System.out.println("No se encontró el nombre en la lista");
        }
    }
  public void cambio(){
      int opcion;
      do{
          System.out.println("Elija una opción");
      System.out.println("1-Cambio estado civil");
      System.out.println("2-Cambio despacho (solo empleados)");
      System.out.println("3-Matricular alumnos(solo alumnos)");
      System.out.println("4-Cambio departamento (solo profesores)");
      System.out.println("5-Cambio seccion (solo personal de servicio)");
      System.out.println("6-salir");
      opcion=leer.nextInt();
      leer.nextLine();
      switch(opcion){
          case 1:
              cambiarEstadoCivil();
              break;
          case 2:
              cambiarDespacho();
              break;
          case 3:
              matricularAlumno();
              break;
          case 4:
              cambioDepartamento();
              break;
          case 5:
              cambioSeccion();
              break;
          
      }
      }while(opcion!=6);
  }
}
