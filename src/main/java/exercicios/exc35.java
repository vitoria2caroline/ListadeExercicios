package exercicios;
import java.util.Scanner;
public class exc35 {
   /* 35) Escreva um programa que leia três números inteiros e exiba a média aritmética. Se a média for maior ou igual a 7, exiba a mensagem "Aprovado", caso contrário, exiba a mensagem "Reprovado". */
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite o primeiro número: ");
       int num1 = entrada.nextInt();
       System.out.print("Digite o segundo número: ");
       int num2 = entrada.nextInt();
       System.out.print("Digite o terceiro número: ");
       int num3 = entrada.nextInt();
       double media = (num1 + num2 + num3) / 3.0;
       String situacao; if (media >= 7) { situacao = "Aprovado";
       } else { situacao = "Reprovado";
       } System.out.printf("A média é: %.2f\n", media);
       System.out.println("Situação: " + situacao); } }
