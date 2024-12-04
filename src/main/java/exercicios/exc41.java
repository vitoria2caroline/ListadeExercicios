package exercicios;
import java.util.Scanner;
public class exc41 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite um número inteiro positivo: ");
       int numero = scanner.nextInt(); int i = 1;
       System.out.println("Os divisores de " + numero + " são:");
       while (i <= numero) { if (numero % i == 0)
       { System.out.println(i); } i++;
       }
   }
}
