/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author blasd
 */
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }   

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
        
public void crearCircunferencia(double radio){
    
    this.radio = radio;
    
}
public double area(){
    double arrea = radio*radio*Math.PI;
    return arrea;
}
public double perimetro(){
    double perrimetro = 2*Math.PI*radio;
    return perrimetro;
}

}
