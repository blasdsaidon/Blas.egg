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
public class IronCasco {
    private int consola=100,sintetizador=100,salud=100;

    public IronCasco() {
    }

    public IronCasco(int consola, int sintetizador, int salud) {
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.salud=salud;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getConsola() {
        return consola;
    }

    public void setConsola(int consola) {
        this.consola = consola;
    }

    public int getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(int sintetizador) {
        this.sintetizador = sintetizador;
    }

    @Override
    public String toString() {
        return "IronCasco{" + "consola=" + consola + ", sintetizador=" + sintetizador + '}';
    }
    
}
