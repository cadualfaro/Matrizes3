/*
Atividade 3: Calcular o valor mínimo de cada índice de 2 matrizes
 */
package matrizes3;
import java.util.Arrays;
import java.util.Random;
public class Matrizes3 {

    public static void main(String[] args) {

        Random rand = new Random();
            int matrizA [][] = new int[5][5];
            int matrizB [][] = new int[5][5];
            int minimo [][] = new int[5][5];
            
            for(int i=0;i<matrizA.length;i++)
                for(int j=0;j<matrizA.length;j++)
                    matrizA [i][j] = rand.nextInt(30);
            
            for(int i=0;i<matrizB.length;i++)
                for(int j=0;j<matrizB.length;j++)
                    matrizB [i][j] = rand.nextInt(30);

            for(int i=0;i<minimo.length;i++)
                for(int j=0;j<minimo.length;j++)
                    minimo [i][j] = Math.min(matrizA[i][j],matrizB[i][j]);
                    
            for(int i=0;i<minimo.length;i++)
                    System.out.println(Arrays.toString(minimo[i]));
    }
    
}
