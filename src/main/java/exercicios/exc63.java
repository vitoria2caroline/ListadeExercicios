package exercicios;
import java.util.Scanner;
public class exc63 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Digite um número inteiro: ");
     int numero = scanner.nextInt();
     if (numero < 0) { numero = -numero; }
     int temp = numero; int divisor = 1;
     while (temp >= 10) { divisor *= 10; temp /= 10; }
     do { int digito = numero / divisor; System.out.println(digito);
         numero %= divisor; divisor /= 10; } while (divisor > 0); } }
