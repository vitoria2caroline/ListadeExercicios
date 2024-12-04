package exercicios;
import java.util.Scanner;
public class exc84 {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int[] numeros = new int[5];
      int contadorPares = 0;
      for (int i = 0; i < 5; i++) {
          System.out.print("Digite o " + (i + 1) + "º número: ");
          numeros[i] = entrada.nextInt(); }
       for (int i = 0; i < 5; i++)
       { if (numeros[i] % 2 == 0) { contadorPares++;
       } }
       System.out.println("Quantidade de números pares: " + contadorPares);
       entrada.close();
  }
}
