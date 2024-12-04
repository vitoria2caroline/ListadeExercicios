package exercicios;
import java.util.Scanner;
public class exc105 {
          public static void main(String[] args)
          { Scanner entrada = new Scanner(System.in);
              int[][] matriz = new int[4][4];
              int[] somaColunas = new int[4];
              for (int i = 0; i < 4; i++) {
                  for (int j = 0; j < 4; j++)
                  { System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                      matriz[i][j] = entrada.nextInt(); } }
              for (int j = 0; j < 4; j++)
              { for (int i = 0; i < 4; i++)
              { somaColunas[j] += matriz[i][j]; } }
              for (int j = 0; j < 4; j++)
              { System.out.println("Soma da coluna " + (j + 1) + ": " + somaColunas[j]);
              } entrada.close();
          } }

