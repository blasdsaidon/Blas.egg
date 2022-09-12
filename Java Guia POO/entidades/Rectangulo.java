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
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void dibuja() {

        //Linea superior
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println("");

        //centro de la forma
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < base - 2; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");
        }

        //Linea inferior
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }

    }

    public void superficie() {
        System.out.println("La superficie del rectángulo es " + (base * altura) / 2 + "m2");
    }

    public void area() {
        System.out.println("El área del rectángulo es " + (base + altura) * 2 + "m");
    }
}
