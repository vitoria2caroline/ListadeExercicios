package exercicios;
import java.util.Scanner;
public class exc58 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Digite um número inteiro: ");
     int numero = scanner.nextInt();
     int a = 0, b = 1;
     int fibonacci = 0;
     System.out.println("Sequência de Fibonacci até " + numero + ":");
     do { System.out.print(fibonacci + " ");
         a = b; b = fibonacci; fibonacci = a + b;
     } while (fibonacci <= numero); } }
