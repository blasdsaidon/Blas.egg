/*
    Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
       restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
       matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio15Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero"); 
        double num1 =leer.nextInt();
        System.out.println("Ingrese el segundo numero"); 
        double num2 =leer.nextInt();
        System.out.println("Elija una opción:\n1.sumar\n2.restar\n3.multiplicar\n4.dividir");
        int opcion=leer.nextInt();
        
        switch(opcion)  {
            case 1:
                double retorno = sumar(num1,num2);
                System.out.println("el resultado es "+retorno);    
            break;
            case 2: 
                double retor = restar(num1,num2);
                System.out.println("el resultado es "+retor);
            break;
            case 3:  
                double reto = multi(num1,num2);
                System.out.println("el resultado es "+reto);
            break;
            case 4: 
                double retorn = divis(num1,num2);
                System.out.println("el resultado es "+retorn);
            break;
        
        
    }
    }
    public static double sumar (double num1,double  num2){
        double suma;
        suma=num1+num2;        
        
        
    
        return suma;
    }
    public static double restar (double num1, double num2){
        double resta;
        resta=num1-num2;
        return resta;
    }
    public static double multi (double num1, double num2){
        double multiplicar;
        multiplicar=num1*num2;
        return multiplicar;    
    }
    public static double divis (double num1, double num2){
        double division;
        division=num1/num2; 
        return division;
    }
}
