package exercicios;
import java.util.Scanner;
public class exc8 {
   /* 8) Escreva um programa que leia dois números inteiros e troque os seus valores, ou seja, o primeiro deve ficar com o valor do segundo e vice-versa. */
        public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite o primeiro número: ");
       int num1 = entrada.nextInt();
       System.out.print("Digite o segundo número: ");
       int num2 = entrada.nextInt();
       System.out.println("Primeiro número: " + num1);
       System.out.println("Segundo número: " + num2);
       int temp = num1; num1 = num2; num2 = temp;
       System.out.println("Primeiro número: " + num1);
       System.out.println("Segundo número: " + num2);
   }
   }

