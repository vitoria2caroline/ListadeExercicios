package exercicios;
import java.util.Scanner;
public class exc40 {
  public static void main(String[] args)
  { Scanner scanner = new Scanner(System.in);
      System.out.print("Digite um número inteiro: ");
      int numero = scanner.nextInt(); int i = 1;
      while (i <= 10) { int resultado = numero * i;
          System.out.println(numero + " x " + i + " = " + resultado); i++;
      }
  }
}
