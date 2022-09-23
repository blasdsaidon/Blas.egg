/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import entidades.Persona12;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ServiciosPersona12 {
    Scanner leer=new Scanner(System.in);
    public Persona12 crearPersona(){
        int dia, mes, anio;
         System.out.println("Ingrese su nombre");
        String nombre=leer.nextLine();
        System.out.println("Ingrese su año de nacimiento");
        anio=leer.nextInt();
        System.out.println("ingrese el mes de nacimiento");
        mes=leer.nextInt();
        System.out.println("Ingrese el dia de nacimiento");
        dia=leer.nextInt();
        Date fechaNac=new Date(anio-1900,mes-1,dia);
       
        return new Persona12(nombre,fechaNac);
        
    }
    public int calcularEdad(Persona12 persona){
        
        Date fechaNac=persona.getFechaNac();
        Date fechaActual=new Date();
        int diferencia = fechaActual.getYear()-fechaNac.getYear();
        
        if ((fechaNac.getMonth()>fechaActual.getMonth()) || (fechaNac.getMonth()==fechaActual.getMonth() && fechaNac.getDate()>fechaActual.getDate())){
            diferencia = diferencia - 1;
        }
        //System.out.println("su edad es: "+diferencia+" años");
        return diferencia;
    }
    public void menorQue(int edad, Persona12 persona){
        int edadPersona=calcularEdad(persona);
        boolean menor=false;
        if(edadPersona<edad){
            menor=true;
        }
        System.out.println(menor);
    }
    public void mostrarPersona(Persona12 persona){
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Fecha de nacimiento: "+persona.getFechaNac());
        System.out.println("su edad es: "+calcularEdad(persona)+" años");
    }
    
}
