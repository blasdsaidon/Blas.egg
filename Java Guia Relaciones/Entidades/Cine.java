/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author blasd
 */
public class Cine {
    private Asiento[][] sala;
    private Pelicula peli;
    private ArrayList<Espectador> publico;
    private int precio;
    
    public int getPrecio() {
        return precio;
    }

    public void setPublico(ArrayList<Espectador> publico) {
        this.publico = publico;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", peli=" + peli + ", publico=" + publico + ", precio=" + precio + '}';
    }

    public Cine(Asiento[][] sala, Pelicula peli, ArrayList<Espectador> publico, int precio) {
        this.sala = sala;
        this.peli = peli;
        this.publico = publico;
        this.precio = precio;
    }

   

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public ArrayList<Espectador> getPublico() {
        return publico;
    }

   
    

    public Cine() {
    }
   
}
