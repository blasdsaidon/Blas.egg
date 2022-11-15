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
public class Revolver {
    private int posicionActual, posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    public void llenarRevolver(){
        posicionActual=(int)(Math.random()*((7-1)+1));
        posicionAgua=(int)(Math.random()*((7-1)+1));
    }
    public boolean mojar(){
        return (posicionActual==posicionAgua);
            
        }
    public void siguienteChorro(){
        if(posicionActual==6){
            posicionActual=1;
        }else{
            this.posicionActual=(posicionActual+1);
        }
    }
    
}
