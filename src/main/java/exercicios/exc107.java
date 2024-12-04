package exercicios;
import java.util.Scanner;
public class exc107 {
 public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     int[][] matriz = new int[3][3];
     int produtoDiagonal = 1;
     for (int i = 0; i < 3; i++)
     { for (int j = 0; j < 3; j++)
     { System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
         matriz[i][j] = entrada.nextInt(); } }
     for (int i = 0; i < 3; i++) { produtoDiagonal *= matriz[i][2 - i]; }
     System.out.println("O produto dos elementos da diagonal secundária é: " + produtoDiagonal);
     entrada.close();
 }
}
