package exercicios;
import java.util.Scanner;
public class exc57 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite um número inteiro: ");
       int numero = scanner.nextInt();
       if (numero <= 1) { System.out.println(numero + " não é um número primo.");
           return; } int i = 2; boolean ehPrimo = true;
           do { if (numero % i == 0) { ehPrimo = false; break;
           } i++; } while (i <= numero / 2);
           if (ehPrimo) { System.out.println(numero + " é um número primo.");
           } else { System.out.println(numero + " não é um número primo."); } } }
