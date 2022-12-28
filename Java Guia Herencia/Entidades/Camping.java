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
public final class Camping extends AlojamientosExtrahoteleros {

    private int cantidadCarpas;
    private int cantidadBanios;
    private boolean hayRestaurante;

    public Camping() {
    }

    public Camping(int cantidadCarpas, int cantidadBanios, boolean hayRestaurante, boolean privado, float superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.cantidadCarpas = cantidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.hayRestaurante = hayRestaurante;
    }

    public int getCantidadCarpas() {
        return cantidadCarpas;
    }

    public void setCantidadCarpas(int cantidadCarpas) {
        this.cantidadCarpas = cantidadCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isHayRestaurante() {
        return hayRestaurante;
    }

    public void setHayRestaurante(boolean hayRestaurante) {
        this.hayRestaurante = hayRestaurante;
    }

    @Override
    public String toStringSuper() {
        return super.toStringSuper() + "\n" + "Camping{" + "cantidadCarpas=" + cantidadCarpas + ", cantidadBanios=" + cantidadBanios + ", hayRestaurante=" + hayRestaurante + '}'; //To change body of generated methods, choose Tools | Templates.
    }

}
