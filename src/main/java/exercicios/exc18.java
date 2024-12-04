package exercicios;
import java.util.Scanner;
   /* 18) Crie um programa que leia dois números inteiros e exiba o maior deles. */
   public class exc18 {
       public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
           System.out.print("Digite o primeiro número inteiro: ");
           int num1 = entrada.nextInt();
           System.out.print("Digite o segundo número inteiro: ");
           int num2 = entrada.nextInt();
           if (num1 > num2) { System.out.println("O maior número é: " + num1);
           } else if (num2 > num1) { System.out.println("O maior número é: " + num2);
           } else { System.out.println("Os dois números são iguais."); }
       }
   }
