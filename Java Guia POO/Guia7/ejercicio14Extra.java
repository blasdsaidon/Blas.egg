/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio14Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de familias"); 
        int fams =leer.nextInt();
        int conthijs=0;
        float contedad=0;
        for (int i = 1; i < fams+1; i++) {
          System.out.println("Ingrese el número de hijos de la familia "+ i); 
            int hijs =leer.nextInt();  
            conthijs=conthijs+hijs;
            for (int j = 1; j < hijs+1; j++) {
                System.out.println("Ingrese la edad del hijo "+j +" de la familia "+ i); 
            int edad =leer.nextInt();  
            contedad=contedad+edad;
                
            }
           
        
        }
         System.out.println("la media de edades es: "+contedad/conthijs);
    }
    
}
