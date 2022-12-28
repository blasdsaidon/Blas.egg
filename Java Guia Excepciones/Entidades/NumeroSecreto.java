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
public class NumeroSecreto {
    public void adivinar(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int secreto = (int) (Math.random() * 500);
        int numero = 0;
       // System.out.println("secreto " + secreto);
        int intentos = 0;
        System.out.println("Bienvenido al programa para adivianar un numero");
        //System.out.println("tiene 5 intentos");

        do {

            try {

                System.out.println("Ingrese un numero");

                numero = leer.nextInt();

            } catch (Exception ex) {
                //// con este leer.nextLine() hacemos que salga del try catch y continue 
                /// pidendo datos
                
               leer.next();
                System.out.println("Ocurrio un error");
                System.out.println("se ingreso un dato de tipo no numerico");
               // System.out.println("Ingrese un numero");

            }

            intentos++;
            if (secreto == numero) {
                System.out.println("Felicitaciones adivino el numero");
                System.out.println("Intentos: "+intentos);
            } else {
                if(numero<secreto){
                    System.out.println("El numero secreto es mayor al numero que ingresaste");
                }else System.out.println("El numero secreto es menor al numero que ingresaste");
                System.out.println("llevas " + intentos + " intentos");
                System.out.println("intenta nuevamente");
            }

           

        } while ( secreto != numero);  //// este es el corchete final del while
        
    }

}
