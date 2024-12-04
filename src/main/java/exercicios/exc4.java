package exercicios;
import java.util.Scanner;

   /* 4) Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e calcule a média ponderada considerando pesos 2, 3 e 5 para as notas, respectivamente. */
   public class exc4{ public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite a primeira nota: ");
       float nota1 = entrada.nextFloat();
       System.out.print("Digite a segunda nota: ");
       float nota2 = entrada.nextFloat();
       System.out.print("Digite a terceira nota: ");
       float nota3 = entrada.nextFloat();
       int peso1 = 2; int peso2 = 3; int peso3 = 5;
       float mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
       System.out.println("A média ponderada é: " + mediaPonderada);
}}
