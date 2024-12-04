package exercicios;
import java.util.Scanner;
public class exc103 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int[][] matriz = new int[3][3];
       int menor = Integer.MAX_VALUE;
       for (int i = 0; i < 3; i++)
       { for (int j = 0; j < 3; j++)
       { System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
           matriz[i][j] = entrada.nextInt();
           if (matriz[i][j] < menor) { menor = matriz[i][j];
           } } } System.out.println("O menor valor presente na matriz é: " + menor);
       entrada.close();
   }
}
