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
public class Electrodomesticos {
    protected Double precio;
    protected String color;
    protected Integer peso;
    protected char Consumo;

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, Integer peso, char Consumo) {
        this.precio = precio;
        this.color = color;
        this.peso = peso;
        this.Consumo = Consumo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public char getConsumo() {
        return Consumo;
    }

    public void setConsumo(char Consumo) {
        this.Consumo = Consumo;
    }

    @Override
    public String toString() {
        return "Electrodomesticos[" + "precio = " + precio + ", color = " + color + ", peso = " + peso + ", Consumo = " + Consumo + ']';
    }

    public void ComprobarConsumoEnergetico() {
        switch (this.getConsumo()) {
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            case 'E':
                break;
            case 'F':
                break;
            default:
                this.setConsumo('F');
        }
    }

    public void ComprobarColor(String colorin) {
        this.setColor(colorin);
        switch (this.getColor()) {
            case "ROJO":
                break;
            case "GRIS":
                break;
            case "AZUL":
                break;
            case "NEGRO":
                break;
            case "BLANCO":
                break;
            default:
                this.setColor("BLANCO");
        }
    }

    public void CrearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Introducir el peso del producto que selecciono: ");
        this.setPeso(leer.nextInt());
        System.out.print("Introducir el color del producto que selecciono: ");
        //this.setColor(leer.next().toUpperCase());
        String colorin=leer.next().toUpperCase();
        ComprobarColor(colorin);
        System.out.print("Introducir el consumo del producto que selecciono:");
        String letra = leer.next().toUpperCase();
        this.setConsumo(letra.charAt(0));
        ComprobarConsumoEnergetico();
        this.setPrecio(1000d);
        //PrecioFinal();
    }

    public void PrecioFinal() {
        /*
        LETRA PRECIO
        A $1000
        B $800
        C $600
        D $500
        E $300
        F $100
         */ 
        
        switch (this.getConsumo()) {
            case 'A':
                this.setPrecio(this.getPrecio()+1000d);
                break;
            case 'B':
                this.setPrecio(this.getPrecio()+800d);
                break;
            case 'C':
                this.setPrecio(this.getPrecio()+600d);
                break;
            case 'D':
                this.setPrecio(this.getPrecio()+500d);
                break;
            case 'E':
                this.setPrecio(this.getPrecio()+300d);
                break;
            case 'F':
                this.setPrecio(this.getPrecio()+100d);
                break;
        }
        
        /*
        PESO PRECIO
        Entre 1 y 19 kg $100
        Entre 20 y 49 kg $500
        Entre 50 y 79 kg $800
        Mayor que 80 kg $1000
         */
        
        if (this.getPeso() >= 1 && this.getPeso() <= 19) {
            this.setPrecio(this.getPrecio() + 100);
        }
        if (this.getPeso() >= 20 && this.getPeso() <= 49) {
            this.setPrecio(this.getPrecio() + 500);
        }
        if (this.getPeso() >= 50 && this.getPeso() <= 79) {
            this.setPrecio(this.getPrecio() + 800);
        }
        if (this.getPeso() >= 80) {
            this.setPrecio(this.getPrecio() +1000);
        }
    }

}
