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
public class Asiento {
   private Espectador espe;
   private String posicion;

    @Override
    public String toString() {
        return "Asiento{" + "espe=" + espe + ", posicion=" + posicion + '}';
    }

    public Espectador getEspe() {
        return espe;
    }

    public void setEspe(Espectador espe) {
        this.espe = espe;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Asiento() {
    }

    public Asiento(Espectador espe, String posicion) {
        this.espe = espe;
        this.posicion = posicion;
    }
}
