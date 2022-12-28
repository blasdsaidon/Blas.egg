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
public class Hotel4Estrellas extends Hoteles {

    protected String gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, float precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toStringSuper() {
        return super.toStringSuper() + "/n" + "Hotel4Estrellas{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}'; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valorHabitacion() {
        super.valorHabitacion();
        float valor = this.getPrecioHabitacion();
        if (this.getCapacidadRestaurante() < 30) {
            valor += 10;
        } else if (this.getCapacidadRestaurante() >= 30 && this.getCapacidadRestaurante() < 50) {
            valor += 30;
        } else {
            valor += 50;
        }
        if ((this.getGimnasio()).equalsIgnoreCase("A")) {
            valor += 50;
        } else {
            valor += 30;
        }

        this.setPrecioHabitacion(valor);
    }

    
    
}
