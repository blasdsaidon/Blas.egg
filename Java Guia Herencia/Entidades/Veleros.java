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
public final class Veleros extends Barco{
 private int numeroMastiles;
    public Veleros() {
    }

    public Veleros(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public Veleros(int numeroMastiles, int añoFabricacion, double eslora, String matricula) {
        super(añoFabricacion, eslora, matricula);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Veleros{" + "numeroMastiles=" + numeroMastiles + '}';
    }

    @Override
    public double precio() {
        return super.precio()+this.getNumeroMastiles(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
