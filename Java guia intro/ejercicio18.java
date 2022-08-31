/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package ejemploguia;

/**
 *
 * @author blasd
 */
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] trasp = new int[4][4];
        for(int i = 0; i <4; i++){
            for(int k=0; k<4; k++){
                matriz[i][k]=(int)(Math.random()*10);
            }
        }
        for(int i = 0; i <4; i++){
            for(int k=0; k<4; k++){
                System.out.print("["+matriz[i][k]+"]");
                
            }
            System.out.println("");
            
        }
        System.out.println("");
        
//         for(int i = 0; i <3; i++){
//            for(int k=0; k<3; k++){
//                trasp[i][k]=matriz[k][i];
//            }
//        }
         for(int i = 0; i <4; i++){
            for(int k=0; k<4; k++){
                System.out.print("["+matriz[k][i]+"]");
                
            }
            System.out.println("");
        }
    }
    
}
