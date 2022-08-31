/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejemploguia;

import java.util.Scanner;

/**
 *
 * @author blasd
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba una frase");
        String frase  = leer.next();
        
        int k,i;
        k=0;
        i=0;
     while (!frase.equals("&&&&&")){
        if (frase.substring(0,1).equals("X") && (frase.substring(frase.length()-1,frase.length()).equals("O"))&& frase.length()<=5) {
            i=i+1;   
        }else {
            k=k+1;
        }
        System.out.println("escriba una frase");
        frase  = leer.next();
         
    }
     System.out.println("correctas "+i+ ", incorrectas " +k);
    }
}
