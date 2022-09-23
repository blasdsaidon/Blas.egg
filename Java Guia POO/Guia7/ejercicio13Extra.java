/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio13Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a=""; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de escalones"); 
        int n =leer.nextInt();
        for (int i = 1; i < n+1; i++) {
            System.out.println(a+i); 
            a=(a+i);
        }
    }
    
}
