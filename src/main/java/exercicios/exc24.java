package exercicios;
import java.util.Scanner;
public class exc24 {
    /*24) Crie um programa que leia três números inteiros e exiba-os em ordem crescente.*/
     public static void main(String[] args) { Scanner entrada = new Scanner(System.in);
         System.out.print("Digite o primeiro número: ");
         int num1 = entrada.nextInt();
         System.out.print("Digite o segundo número: ");
         int num2 = entrada.nextInt();
         System.out.print("Digite o terceiro número: ");
         int num3 = entrada.nextInt();
         int[] numeros = {num1, num2, num3};
         System.out.println("Os números em ordem crescente são: ");
         for (int num : numeros) { System.out.println(num);
         }
     }
}
