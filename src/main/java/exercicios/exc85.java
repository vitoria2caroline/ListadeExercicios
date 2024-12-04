package exercicios;
import java.util.Scanner;
public class exc85 {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int[] numeros = new int[5];
      for (int i = 0; i < 5; i++) {
          System.out.print("Digite o " + (i + 1) + "º número: ");
          numeros[i] = entrada.nextInt(); }
       int maior = numeros[0]; int menor = numeros[0];
      for (int i = 1; i < 5; i++)
      { if (numeros[i] > maior)
      { maior = numeros[i]; }
          if (numeros[i] < menor) { menor = numeros[i];
          } }
      System.out.println("O maior valor digitado é: " + maior);
      System.out.println("O menor valor digitado é: " + menor);
      entrada.close(); } }
