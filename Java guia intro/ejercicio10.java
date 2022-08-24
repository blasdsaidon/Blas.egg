/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, num1,suma;
        suma=0;
        System.out.println("escriba una cifra limite");
        limite = leer.nextInt();
        System.out.println("escriba un numero");
        num1 = leer.nextInt();
        while (suma<limite) {
            suma=suma+num1  ;
            System.out.println("ingrese otro numero");
            num1 = leer.nextInt();
}
        System.out.println("se alcanzo el limite");
    }
    
}
