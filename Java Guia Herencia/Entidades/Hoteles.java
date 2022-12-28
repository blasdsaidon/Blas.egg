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
public class Hoteles extends Alojamiento {

    protected int cantidadHabitaciones;
    protected int numeroCamas;
    protected int cantidadPisos;
    protected float precioHabitacion;
    
    public Hoteles(int cantidadHabitaciones, int numeroCamas, int cantidadPisos, float precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitacion = precioHabitacion;
    }
    
    public Hoteles() {
    }
    
    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }
    
    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }
    
    public int getNumeroCamas() {
        return numeroCamas;
    }
    
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
    
    public int getCantidadPisos() {
        return cantidadPisos;
    }
    
    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }
    
    public float getPrecioHabitacion() {
        return precioHabitacion;
    }
    
    public void setPrecioHabitacion(float precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    
    @Override
    public String toStringSuper() {
        return super.toStringSuper() + "\n" + "Hoteles{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", numeroCamas=" + numeroCamas + ", cantidadPisos=" + cantidadPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }

    public void valorHabitacion() {
        float valor = 50 * this.getCantidadHabitaciones();
        this.setPrecioHabitacion(valor);
    }
    
}
