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
public class IronBota {
    private int propulsor=100,salud=100;

    public IronBota(int propulsor,int salud) {
        this.propulsor = propulsor;
        this.salud=salud;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public IronBota() {
    }

    public int getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(int propulsor) {
        this.propulsor = propulsor;
    }

    @Override
    public String toString() {
        return "IronBota{" + "propulsor=" + propulsor + ", salud=" + salud + '}';
    }

    
    
}
