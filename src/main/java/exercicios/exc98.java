package exercicios;
import java.util.Scanner;
public class exc98 {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[][] matriz = new int[3][3];
    int somaDiagonal = 0;
    for (int i = 0; i < 3; i++)
    { for (int j = 0; j < 3; j++)
    { System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
        matriz[i][j] = entrada.nextInt();
        if (i == j) { somaDiagonal += matriz[i][j];
        } } } System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonal);
    entrada.close();
} }

