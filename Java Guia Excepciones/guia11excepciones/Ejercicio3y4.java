/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11excepciones;

import Entidades.DivisionNumero;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class Ejercicio3y4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DivisionNumero div=new DivisionNumero();
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        div.setNum1(leer.nextLine());
        div.setNum2(leer.nextLine());
        Integer numero1=0,numero2=0;
        try{
        numero1=numero1.parseInt(div.getNum1());
        numero2=numero2.parseInt(div.getNum2());
        
        int divi=(numero1/numero2);
        System.out.println("La division es: "+divi);
        }catch(ArithmeticException e){
            System.out.println("La division por 0 no esta definida");
        }catch(NumberFormatException a){
            System.out.println("No se ingreso un numero entero");
        }
        
    }
    
}
