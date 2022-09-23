/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio16Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String continua;
        do{
            System.out.println("indique nombre");
            String nombre =leer.next();
            System.out.println("indique edad");
            int num1 =leer.nextInt();
            String retorno = mayor(num1);
            System.out.println(nombre+" "+retorno);
            System.out.println("desea continuar?, ingrese si o no");
            continua =leer.next();
        }while (!continua.equalsIgnoreCase("no"));
        System.out.println("Gracias por participar!");
            
        }
    public static String mayor(int num1){
        String edad;
        if(num1>=18){
            edad="es mayor de edad";
        }else{
            edad="es menor de edad";
        }
        return edad;
    }
    }
    

