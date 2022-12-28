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
public class AlojamientosExtrahoteleros extends Alojamiento {

    protected boolean privado;
    protected float superficie;

    public AlojamientosExtrahoteleros(boolean privado, float superficie, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.superficie = superficie;
    }

    public AlojamientosExtrahoteleros() {
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toStringSuper() {
        return super.toStringSuper() + "\n" + "AlojamientosExtrahoteleros{" + "privado=" + privado + ", superficie=" + superficie + '}';//To change body of generated methods, choose Tools | Templates.
    }

}
