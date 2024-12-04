package exercicios;
import java.util.Scanner;
public class exc94 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int[] numeros = new int[7];
       for (int i = 0; i < 7; i++)
       { System.out.print("Digite o " + (i + 1) + "º número: ");
           numeros[i] = entrada.nextInt();
       } System.out.println("Números pares:");
       for (int i = 0; i < 7; i++)
       { if (numeros[i] % 2 == 0)
       { System.out.println(numeros[i]);
       } } entrada.close();
   }
}

