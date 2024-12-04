package exercicios;
import java.util.Scanner;
public class exc28 {
    /* 28) Faça um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC) e a sua classificação. Considere a tabela de classificação do IMC. */
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
      System.out.print("Digite o peso (kg): ");
      double peso = entrada.nextDouble();
      System.out.print("Digite a altura (m): ");
      double altura = entrada.nextDouble();
      double imc = peso / (altura * altura);
      System.out.printf("Seu IMC é: %.2f\n", imc);
      if (imc < 18.5) { System.out.println("Abaixo do peso");
      } else if (imc >= 18.5 && imc <= 24.9)
      { System.out.println("Peso ideal");
      } else if (imc >= 25 && imc < 29.9) {
          System.out.println("Levemente acima do peso");
      } else if (imc >= 30 && imc < 34.9) {
          System.out.println("Obesidade grau 1");
      } else if (imc >= 35 && imc < 39.9)
      { System.out.println("Obesidade grau 2");
      } else if (imc >= 40) { System.out.println("Obesidade grau 3");
      } else { System.out.println("Classificação inválida"); } } }