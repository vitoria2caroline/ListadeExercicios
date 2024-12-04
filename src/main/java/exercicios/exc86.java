package exercicios;

import java.util.Scanner;
public class exc86 {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int[] numeros = new int[10];
      for (int i = 0; i < 10; i++)
      { System.out.print("Digite o " + (i + 1) + "º número: ");
          numeros[i] = entrada.nextInt(); }
       ordenarCrescente(numeros);
      System.out.println("Números em ordem crescente:");
      for (int i = 0; i < 10; i++) {
          System.out.println(numeros[i]); }
      entrada.close(); }
    public static void ordenarCrescente(int[] array) {
      int n = array.length;
      for (int i = 0; i < n - 1; i++)
      { for (int j = 0; j < n - i - 1; j++)
      { if (array[j] > array[j + 1])
      {  int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
      }
      }
      }
  }
}

