/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import interfases.CalculoFormas;

/**
 *
 * @author blasd
 */
public class Circulo implements CalculoFormas {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo() {
    }

    @Override
    public void calculoArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        System.out.println("El area del circulo es: "+ (PI*this.getRadio()*this.getRadio()));
    }

    @Override
    public void calculoPerimetro() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        System.out.println("El perimetro del circulo es: "+ (PI*this.getRadio()*2));
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
}
