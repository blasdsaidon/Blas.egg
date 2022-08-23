/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class EjemploGuia {

    /**42
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("Escriba su numero");
      int num;
      num = leer.nextInt();
        System.out.println("doble " + num*2 );    
         System.out.println("triple " + num*3 );
          System.out.println("raiz " + (float)Math.sqrt(num) );
    }
    
}
