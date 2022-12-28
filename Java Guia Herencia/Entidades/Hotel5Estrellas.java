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
public final class Hotel5Estrellas extends Hotel4Estrellas {

    private int cantidadSalonesConferencia;
    private int cantidadSuits;
    private int cantidadLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantidadSalonesConferencia, int cantidadSuits, int cantidadLimosinas, String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, float precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuits = cantidadSuits;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuits() {
        return cantidadSuits;
    }

    public void setCantidadSuits(int cantidadSuits) {
        this.cantidadSuits = cantidadSuits;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public String toStringSuper() {
        return super.toStringSuper() + "\n" + "Hotel5Estrellas{" + "cantidadSalonesConferencia=" + cantidadSalonesConferencia + ", cantidadSuits=" + cantidadSuits + ", cantidadLimosinas=" + cantidadLimosinas + '}';

    }

    @Override
    public void valorHabitacion() {
        super.valorHabitacion();
        float valor = this.getPrecioHabitacion();
        valor += (15 * this.getCantidadLimosinas());
        this.setPrecioHabitacion(valor);
    }

}
