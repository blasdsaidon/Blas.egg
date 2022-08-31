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
public class ejercicio19 {
    
        

    
    public static void main(String[] args) {
    int[][] matriz = new int[3][3];
    int[][] trasp = new int[3][3];
    int j=0;
    Scanner teclado = new Scanner(System.in);
        for(int i = 0; i <3; i++){
            for(int k=0; k<3; k++){
                matriz[i][k]=(int)(Math.random()*10);
            }
        }
       for(int i = 0; i <3; i++){
            for(int k=0; k<3; k++){
                System.out.print("["+matriz[i][k]+"]");
                
            }
            System.out.println("");
            
        }
          for(int l = 0; l <3; l++){
            for(int m=0; m<3; m++){
                trasp[l][m]=teclado.nextInt();
            }
        }
        
        for(int l = 0; l <3; l++){
            for(int m=0; m<3; m++){
             if (trasp[l][m]==(matriz[m][l])*-1){
                 j++;
                 
             }   
            }
        }
            for(int i = 0; i <3; i++){
            for(int k=0; k<3; k++){
                System.out.print("["+trasp[i][k]+"]");
                
            }
            System.out.println("");
            
        }
                
            
        if (j==9){
        
        System.out.println("la matriz es antisimetrica");
        }  
    }
    
}
