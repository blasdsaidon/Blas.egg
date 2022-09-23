/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio17Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero"); 
        double num1 =leer.nextInt();
        boolean retorno = primo(num1);
        System.out.println(retorno); 
    }
    public static boolean primo(double num1){
        boolean primis=false;
        int con=0;
        for (int i = 1; i < num1; i++) {
            if(num1%i!=0){
                con++;
            }
            
        }
        if (con==num1-2){
            primis=true;
            
        }
        return primis;
        
        
    }
}
