/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio23Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String pala=" ";
     
        String[][] matriz= new String[20][20];
         for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j]=" ";
            }
        }
        
        for (int k = 0; k < 8; k++) {
            
 
       
        System.out.println("ingrese una palabra para la sopa de letras");
                pala = leer.next();
                
        
        while(!(pala.length()<=5 && pala.length()>=3)){
                System.out.println("ingrese una palabra de entre 3 y 5 caracteres");
               System.out.println("ingrese una palabra para la sopa de letras");
                pala = leer.next();
        }
        boolean inser = false;
      //  int cont=0;
        while(inser==false){
            //System.out.println("estoy en while");
            int fila=(int)(Math.random()*19);
            
            int columna=(int)(Math.random()*(20-pala.length()));
            //System.out.println("columna"+columna+fila);
                int cont=0;
            for (int i = 0; i < 20; i++) {
                if(!matriz[fila][i].equals(" ")){
                    cont++;
                }
            }
        if (cont==0){
           // System.out.println("if de cont=0");
            inser=true;
        for (int i = 0; i < pala.length(); i++) {
            
            matriz[fila][columna+i]=pala.substring(i,i+1);
            
        }
        }
        
        }
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(matriz[i][j].equals(" ")){
                    matriz[i][j]=Integer.toString((int)(Math.random()*9));
                }
                System.out.print("["+matriz[i][j]+"] ");
                
            }
            System.out.println(" ");
            
        }
    


    }
}