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
public final class BarcosMotor extends Barco{
    private int potenciaMotor;

    public BarcosMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public BarcosMotor(int potenciaMotor, int añoFabricacion, double eslora, String matricula) {
        super(añoFabricacion, eslora, matricula);
        this.potenciaMotor = potenciaMotor;
    }

    public BarcosMotor() {
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "BarcosMotor{" + "potenciaMotor=" + potenciaMotor + '}';
    }

    @Override
    public double precio() {
        return super.precio()+this.getPotenciaMotor(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
