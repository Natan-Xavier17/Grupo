package pão;

import java.util.Arrays;
import java.util.List;

public class ArrayCopier {
    public static void main(String[] args) {
        int[] array1 = { 7, 4, 8, 1, 4, 1, 4 }; // Array de números inteiros
        float[] array2 = new float[array1.length]; // Array criada como ponto flutuante com o mesmo tamanho da array1


       /* System.out.print("array1: [ ");
        for (int i = 0; i<array1.length; i++){ // Irá printar a cada iteração o número do índice indicado
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");
       */

        System.out.println( Arrays.toString(array1));

       /* System.out.print("array2: [ ");
        int count = 0; // Variável contadora
        while (count < array1.length && array1[count] != 1){ // Estrutura de repetição while com duas condições de paradas: 1( Caso o count ultrapasse o tamanho da array1; 2( Caso o número do índice indicado do array seja igual a 1
            array2[count] = (float) array1[count]; // Array2 receberá no índice indicado pela variável count o elemento da array1 indicado também pela variável count e float irá converter o número inteiro por ponto flutuante
            System.out.print(array2[count++] + " ");
        }
        System.out.print("]");
       */

        for(int i = 0; i< array1.length && array1[i] != 1; i++) {
            array2[i] = (float) array1[i];
            System.out.print(array2[i] + " ");

        }

    }

}
