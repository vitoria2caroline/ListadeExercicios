
package exercicios;
import java.util.Scanner;
public class exc87 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivos = 0, negativos = 0, zeros = 0;
        for (int i = 0; i < 10; i++)
        { System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt(); }
       for (int i = 0; i < 10; i++) { if (numeros[i] > 0)
       { positivos++;
       } else if (numeros[i] < 0)
       { negativos++;
       } else { zeros++; } }
       System.out.println("Quantidade de números positivos: " + positivos);
       System.out.println("Quantidade de números negativos: " + negativos);
       System.out.println("Quantidade de zeros: " + zeros); entrada.close();
    }}

