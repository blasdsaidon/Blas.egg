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
public class Barco {
    protected int añoFabricacion;
    protected double eslora;
    protected String matricula;

    public Barco() {
    }

    public Barco(int añoFabricacion, double eslora, String matricula) {
        this.añoFabricacion = añoFabricacion;
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Barco{" + "a\u00f1oFabricacion=" + añoFabricacion + ", eslora=" + eslora + ", matricula=" + matricula + '}';
    }
    public double precio(){
    double mod = this.getEslora()*10;
    return mod;
}
}
