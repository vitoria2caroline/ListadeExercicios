package exercicios;
import java.util.Scanner;
public class exc102 {
  public static void main(String[] args)
  { Scanner entrada = new Scanner(System.in);
      int[][] matriz1 = new int[2][2];
      int[][] matriz2 = new int[2][2];
      int[][] produtoMatriz = new int[2][2];
      System.out.println("Digite os elementos da primeira matriz:");
      for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 2; j++)
          { matriz1[i][j] = entrada.nextInt();
          } } System.out.println("Digite os elementos da segunda matriz:");
      for (int i = 0; i < 2; i++)
      { for (int j = 0; j < 2; j++)
      { matriz2[i][j] = entrada.nextInt();
      } } for (int i = 0; i < 2; i++)
      { for (int j = 0; j < 2; j++) { produtoMatriz[i][j] = 0;
          for (int k = 0; k < 2; k++)
          { produtoMatriz[i][j] += matriz1[i][k] * matriz2[k][j];
          } } } System.out.println("O produto das duas matrizes é:");
      for (int i = 0; i < 2; i++)
      { for (int j = 0; j < 2; j++)
      { System.out.print(produtoMatriz[i][j] + " "); }
          System.out.println(); } entrada.close();
  }
}
