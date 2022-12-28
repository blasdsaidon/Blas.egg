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
public final class Lavadora extends Electrodomesticos {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer Carga) {
        this.carga = Carga;
    }

    public Lavadora(Integer Carga, Double precio, String color, Integer peso, char Consumo) {
        super(precio, color, peso, Consumo);
        this.carga = Carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer Carga) {
        this.carga = Carga;
    }

    @Override
    public String toString() {
        return "Lavadora[" + "Carga = " + carga + ']';
    }

    public void CrearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        CrearElectrodomestico();
        System.out.print("Introduzca la carga que soporta el lavarropas: ");
        this.setCarga(leer.nextInt());
        PrecioFinal();
    }



    @Override
    public void PrecioFinal() {
        super.PrecioFinal(); //To change body of generated methods, choose Tools | Templates.
         if (this.getCarga() > 30) {
            this.setPrecio(this.getPrecio() + 500);
        }
        System.out.println("El precio final de la Lavadora es de: $" + this.getPrecio() + ", y el color del producto que eligio es: " + this.getColor());
    }
    
}

    

