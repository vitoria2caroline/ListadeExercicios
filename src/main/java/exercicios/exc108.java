package exercicios;
import java.util.Scanner;
public class exc108 {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int[][] matriz = new int[4][4];
      for (int i = 0; i < 4; i++)
      { for (int j = 0; j < 4; j++)
      { System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
          matriz[i][j] = entrada.nextInt(); } } for (int i = 0; i < 4; i++)
          { int maiorValor = matriz[i][0]; for (int j = 1; j < 4; j++)
          { if (matriz[i][j] > maiorValor) { maiorValor = matriz[i][j]; } }
              System.out.println("O maior valor na linha " + (i + 1) + " é: " + maiorValor); }
      entrada.close();
  }
}

