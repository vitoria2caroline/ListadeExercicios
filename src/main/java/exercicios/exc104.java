package exercicios;
import java.util.Scanner;
public class exc104 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean simetrica = true;
        for (int i = 0; i < 3; i++)
        { for (int j = 0; j < 3; j++)
        { System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
            matriz[i][j] = entrada.nextInt();
        } } for (int i = 0; i < 3; i++)
        { for (int j = 0; j < 3; j++)
        { if (matriz[i][j] != matriz[j][i])
        { simetrica = false; break; } }
            if (!simetrica) { break; } }
        if (simetrica) { System.out.println("A matriz é simétrica."); }
        else { System.out.println("A matriz não é simétrica.");
        } entrada.close(); } }
