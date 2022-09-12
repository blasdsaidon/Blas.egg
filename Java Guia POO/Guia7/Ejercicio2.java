/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package Guia7;

import entidades.Circunferencia;

/**
 *
 * @author blasd
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circunferencia c1 = new Circunferencia();
       c1.setRadio(2.4654654);
       double retorno=c1.area();
       double retor=c1.perimetro();
        System.out.println("area "+retorno);
        System.out.println("perimetro "+retor);
    }
    
}
