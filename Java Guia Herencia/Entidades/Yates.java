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
public final class Yates extends Barco {
   private int potenciaMotor,numeroCamarotes;

    public Yates() {
    }

    public Yates(int potenciaMotor, int numeroCamarotes) {
        this.potenciaMotor = potenciaMotor;
        this.numeroCamarotes = numeroCamarotes;
    }

    public Yates(int potenciaMotor, int numeroCamarotes, int añoFabricacion, double eslora, String matricula) {
        super(añoFabricacion, eslora, matricula);
        this.potenciaMotor = potenciaMotor;
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return "Yates{" + "potenciaMotor=" + potenciaMotor + ", numeroCamarotes=" + numeroCamarotes + '}';
    }

    @Override
    public double precio() {
        return super.precio()+this.getPotenciaMotor()+this.getNumeroCamarotes(); //To change body of generated methods, choose Tools | Templates.
    }
   
}
