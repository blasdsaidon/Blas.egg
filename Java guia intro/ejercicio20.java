/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
       
        Scanner leer= new Scanner(System.in);
        do {
            System.out.println("ingrese tamañano matriz");
        n = leer.nextInt();
        }while (n<2 || n>10);
       
        int[][] matriz = new int[n][n];
         int[] vector=new int[2*n+2];
        
        for(int i = 0; i <n; i++){
            for(int k=0; k<n; k++){
                System.out.println("ingrese un numero de 1 a 9");
                int j = leer.nextInt();
                while (j<1 || j>9){
                    System.out.println("ingrese un numero valido");
                }
                matriz[i][k]=j;
            }
        }
        magica(n,matriz,vector);
    }
    public static void magica(int n,  int[][] matriz, int[] vector){
        int suma1=0;
         for(int i = 0; i <n; i++){
            for(int k=0; k<n; k++){
                suma1= suma1+matriz[i][k];
                
            }
            vector[i]=suma1;
            suma1=0;
            } 
         for(int k = 0; k <n; k++){
            for(int i=0; i<n; i++){
                suma1= suma1+matriz[i][k];
                
            }
            vector[k+n]=suma1;
            suma1=0;
         }
         for(int i = 0; i <n; i++){
            for(int k=0; k<n; k++){
             if(i==k){
                 suma1=suma1+matriz[i][k];
             }
            }
            vector[2*n]=suma1;
            
            }
         suma1=0;
         
         for(int i = 0; i <n; i++){
            for(int k=0; k<n; k++){
                if(i+k==(n-1)){
                    suma1=suma1+matriz[i][k];
                }
                }
            vector[2*n+1]=suma1;
            
            }
         System.out.println(" ");
          for(int i = 0; i <(2*n+2); i++){
              System.out.println(vector[i]);
          }
          
          int p=0;
          for(int i = 1; i <(2*n+2); i++){
              if (vector[i-1]==vector[i]){
                  p++;
              }
          }
          if (p==2*n+1){
              System.out.println("matriz magica");
          }else{
              System.out.println("nah");
          }
              
              
                    
                
         
        
    }
}
