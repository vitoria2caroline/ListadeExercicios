package exercicios;
import java.util.Scanner;
public class exc97 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int[][] matriz = new int[2][2];
       int soma = 0;
       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
               System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
               matriz[i][j] = entrada.nextInt();} }
       for (int i = 0; i < 2; i++)
       { for (int j = 0; j < 2; j++)
       { soma += matriz[i][j]; } }
       System.out.println("A soma de todos os elementos da matriz é: " + soma);
       entrada.close();
   }
}
