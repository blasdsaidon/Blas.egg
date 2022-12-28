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
public final class Residencias extends AlojamientosExtrahoteleros {

    private int cantidadHabitaciones;
    private boolean dtosGremios;
    private boolean hayCampoDeportivo;

    public Residencias() {
    }

    public Residencias(int cantidadHabitaciones, boolean dtosGremios, boolean hayCampoDeportivo, boolean privado, float superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.dtosGremios = dtosGremios;
        this.hayCampoDeportivo = hayCampoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDtosGremios() {
        return dtosGremios;
    }

    public void setDtosGremios(boolean dtosGremios) {
        this.dtosGremios = dtosGremios;
    }

    public boolean isHayCampoDeportivo() {
        return hayCampoDeportivo;
    }

    public void setHayCampoDeportivo(boolean hayCampoDeportivo) {
        this.hayCampoDeportivo = hayCampoDeportivo;
    }

    @Override
    public String toStringSuper() {
        return super.toStringSuper() + "\n" + "Residencias{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", dtosGremios=" + dtosGremios + ", hayCampoDeportivo=" + hayCampoDeportivo + '}';//To change body of generated methods, choose Tools | Templates.
    }

}
