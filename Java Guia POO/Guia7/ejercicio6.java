/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         String frase;
        System.out.println("escriba una frase");
        frase = leer.next();
        String cadena = "eureka";
        if (cadena.equals(frase)){
            System.out.println("correcto");
        }
        else {
        System.out.println("incorrecto");}
    }
    
}
