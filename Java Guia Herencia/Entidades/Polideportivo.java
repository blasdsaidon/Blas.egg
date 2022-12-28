/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author blasd
 */
public class Polideportivo extends Edificio{
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", techado=" + techado + '}';
    }
    
    @Override
    public void calcularSuperficie() {
        
        System.out.println("La superficie del Polideportivo es: "+(this.getLargo()*this.getAncho())+"m2");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del Polideportivo es "+(this.getAlto()*this.getLargo()*this.getAncho())+"m3");
    }
    
}
