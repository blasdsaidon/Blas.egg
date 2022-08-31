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
public class ejercicio21 {
     public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        int[][] matrizP = new int[3][3];
        int veces = 0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
           //     matriz[i][j] = leer.nextInt();
               // matriz[i][j]=j+1;
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
        System.out.println("ingrese los valores de la matrizP");
        for (int j = 0; j < 3; j++) {
            for (int h = 0; h < 3; h++) {
                System.out.print("Posición Fila: " + (j+1)+" Columna: "+ (h+1)+" -> ");
                matrizP[j][h] = leer.nextInt();
            }
            System.out.println(" ");
        }
        //String cadena = "";
        int contador;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == matrizP[0][0]) {
                    if (i + 2 < 10 && j + 2 < 10) {
                        contador = 0;
                        for (int h = 0; h < 3; h++) {
                            for (int k = 0; k < 3; k++) {
                                if (matriz[i + h][j + k] != matrizP[h][k]) {
                                    contador++;
                                    //break;
                                }
                            }
                        }
                        if (contador == 0){
                            veces ++;
                            System.out.println(veces + "º Aparición... seguimos Analizando");
                            System.out.println("la matrizP se encuentra en la posicion: "+i+ ","+j);
                        }
                    }
                }
            }
        }
        if (veces==0){
            System.out.println("la matrizP NO se encuentra en matriz");
        }else{
            System.out.println("Total de Apariciones: "+ veces);
        }
}
}