package exercicios;
import java.util.Scanner;
public class exc106 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int[][] matriz1 = new int[2][2];
       int[][] matriz2 = new int[2][2];
       boolean iguais = true;
       System.out.println("Digite os elementos da primeira matriz:");
       for (int i = 0; i < 2; i++)
       { for (int j = 0; j < 2; j++)
       { matriz1[i][j] = entrada.nextInt(); } }
       System.out.println("Digite os elementos da segunda matriz:");
       for (int i = 0; i < 2; i++)
       { for (int j = 0; j < 2; j++)
       { matriz2[i][j] = entrada.nextInt();
       } } for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
               if (matriz1[i][j] != matriz2[i][j]) { iguais = false; break; } }
           if (!iguais) { break; } }
       if (iguais) { System.out.println("As matrizes são iguais.");
       } else { System.out.println("As matrizes não são iguais.");
       } entrada.close(); } }

