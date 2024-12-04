package exercicios;
import java.util.Scanner;
public class exc73 {
     public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
         System.out.print("Digite um número inteiro: ");
         int numero = scanner.nextInt();
         int a = 0, b = 1; System.out.print("Sequência de Fibonacci até " + numero + ": ");
         while (a <= numero) { System.out.print(a + " ");
             int proximo = a + b; a = b; b = proximo; } } }