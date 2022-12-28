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
public class IronGuante {
    private int expulsor=100,salud=100;

    public IronGuante() {
    }

    public IronGuante(int expulsor,int salud) {
        this.expulsor = expulsor;
        this.salud=salud;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getExpulsor() {
        return expulsor;
    }

    public void setExpulsor(int expulsor) {
        this.expulsor = expulsor;
    }

    @Override
    public String toString() {
        return "IronGuante{" + "expulsor=" + expulsor + '}';
    }
    
    
}
