package exercicios;
import java.util.Scanner;
public class exc21 {
   /* 21) Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são menores de idade e quantas são maiores de idade. */
       public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
           System.out.print("Digite o número de pessoas: ");
           int numPessoas = entrada.nextInt();
           int menoresIdade = 0;
           int maioresIdade = 0;
           for (int i = 0; i < numPessoas; i++) {
               System.out.print("Digite a idade da pessoa " + (i + 1) + ": "+numPessoas);
           int idade = entrada.nextInt();
          if (idade < 18) { menoresIdade++; } else { maioresIdade++;
          } } System.out.println("Menores de idade: " + menoresIdade);
       System.out.println("Maiores de idade: " + maioresIdade); } }

