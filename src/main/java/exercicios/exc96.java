package exercicios;
import java.util.Scanner;
public class exc96 {
     public static void main(String[] args)
     { Scanner entrada = new Scanner(System.in);
         int[][] matriz = new int[3][3];
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++)
             { System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                 matriz[i][j] = entrada.nextInt();
             } } System.out.println("Matriz 3x3:");
         for (int i = 0; i < 3; i++)
         { for (int j = 0; j < 3; j++)
         { System.out.print(matriz[i][j] + "\t");
         } System.out.println();
         } entrada.close(); } }
