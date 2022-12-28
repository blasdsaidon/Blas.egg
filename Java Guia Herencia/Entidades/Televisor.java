/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author blasd
 */

    public final class Televisor extends Electrodomesticos {
    private Double pulgadas;
    private boolean TDT =false;

    public Televisor(Double pulgadas, boolean TDT) {
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Televisor(Double pulgadas, boolean TDT, Double precio, String color, Integer peso, char Consumo) {
        super(precio, color, peso, Consumo);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Televisor() {
    }

   

    



    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return "Televisor[" + "pulgadas = " + pulgadas + ", TDT = " + TDT + ']';
    }
    
    public void CrearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        CrearElectrodomestico();
        System.out.print("Introduzca las pulgadas del televisor: ");
        this.setPulgadas(leer.nextDouble());
        System.out.print("El televisor tiene TDT? ");
        String Verificar = leer.next().toUpperCase();
        if (Verificar.equalsIgnoreCase("SI")) {
            this.setTDT(true);
        }
        PrecioFinal();
    }
    


    @Override
    public void PrecioFinal() {
        super.PrecioFinal(); //To change body of generated methods, choose Tools | Templates.
        if (this.getPulgadas() > 40) {
            this.setPrecio(this.getPrecio() * 1.3);
        }
        if (this.isTDT()) {
            this.setPrecio(this.getPrecio() + 500);
        }
        System.out.println("El precio final del Televisor es de: $" + this.getPrecio() + ", y el color del producto que eligio es: " + this.getColor());
    }
}




