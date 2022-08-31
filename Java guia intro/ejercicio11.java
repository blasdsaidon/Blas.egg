/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba un numero");
        int num1 = leer.nextInt();
        System.out.println("escriba un numero");
        int num2 = leer.nextInt();
        
        String salida;
        int opcion;
        boolean salir = false;
        while(salir==false){
            System.out.println("elija una opcion");
        System.out.println("1.sumar\n2.restar\n3.multiplicar\n4.dividir\n5.salir");
        opcion=leer.nextInt();
        switch(opcion)  {
            case 1: System.out.println(num1+num2);
            break;
            case 2:  System.out.println(num1-num2);
            break;
            case 3:  System.out.println(num1*num2);
            break;
            case 4: System.out.println(num1/num2);
            break;
            case 5: System.out.println("Está seguro que desea salir?");
                    System.out.println("S/N");
                    salida=leer.next();
                    if (salida.equalsIgnoreCase("s")){
                        salir=true;
                    }
                    break;
            default: System.out.println("elija una opcion");
        System.out.println("1.sumar\n2.restar\n3.multiplicar\n4.dividir\n5.salir");
        opcion=leer.nextInt();
        break;
                
                    
        }
        
    }
      System.out.println("gracias por participar");  
    }
}
