package exercicios;
import java.util.Scanner;
public class exc101 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int[][] matriz = new int[4][4];
       int soma = 0;
       int totalElementos = 16;
       for (int i = 0; i < 4; i++)
       { for (int j = 0; j < 4; j++)
       { System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
           matriz[i][j] = entrada.nextInt();
           soma += matriz[i][j];
       } } double media = (double) soma / totalElementos;
       System.out.println("A média aritmética dos elementos da matriz é: " + media);
       entrada.close(); } }