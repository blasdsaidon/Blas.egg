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
public class ejercicio11_Manos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String text;
        System.out.println("Ingrese el texto a cifrar");
        text = leer.nextLine();
        System.out.println("La frase cifrada es: ");
        String retorno = cifrado(text);
        System.out.println(retorno);
    }

    public static String cifrado(String text) {
        String textocifrado;
        int k;

        for (k = 0; k < text.length(); k++) {
            switch (text.substring(k, k + 1)) {
                case "a":
                    text = text.replace("a", "@");
                    break;
                case "e":
                    text = text.replace("e", "#");
                    break;
                case "i":
text = text.replace("i", "$");
                    break;
                case "o":
                    text = text.replace("o", "%");
                    break;
                case "u":
                    text = text.replace("u", "*");
                    break;
                case "A":
                    text = text.replace("A", "@");
                    break;
                case "E":
                    text = text.replace("E", "#");
                    break;
                case "I":
                    text = text.replace("I", "$");
                    break;
                case "O":
                    text = text.replace("O", "%");
                    break;
                case "U":
                    text = text.replace("U", "*");
                    break;
            }
        }
        textocifrado = text;
        return textocifrado;
    }
}

    
    

