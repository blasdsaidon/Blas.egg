/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    protected String nombre;
    protected String apellido;
    protected int identificacion;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    
    public String toStringg() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
    
}
