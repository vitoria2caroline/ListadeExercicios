package exercicios;
import java.util.Scanner;
public class exc109 {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int[][] matriz = new int[3][3];
      boolean identidade = true;
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++)
          { System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
              matriz[i][j] = entrada.nextInt();
              if (i == j) { if (matriz[i][j] != 1) { identidade = false; } }
              else { if (matriz[i][j] != 0) { identidade = false;
              } } } } if (identidade)
              { System.out.println("A matriz é uma matriz identidade."); }
      else { System.out.println("A matriz não é uma matriz identidade."); } entrada.close();
  }
}
