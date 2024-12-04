package exercicios;
import java.util.Scanner;
public class exc13 {
    /* 13) Faça um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do segundo. */
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.print("Digite o primeiro número inteiro: ");
         int num1 = entrada.nextInt();
         System.out.print("Digite o segundo número inteiro: ");
         int num2 = entrada.nextInt();
         if (num2 != 0 && num1 % num2 == 0) { System.out.println("O número " + num1 + " é múltiplo de " + num2);}
         else { System.out.println("O número " + num1 + " não é múltiplo de " + num2);
         }
     }
}

