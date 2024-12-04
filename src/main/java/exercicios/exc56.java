package exercicios;
import java.util.Scanner;
public class exc56 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite um número inteiro positivo: ");
       int numero = scanner.nextInt();
       if (numero <= 0) { System.out.println("Por favor, digite um número inteiro positivo.");
           return; } int i = 1;
       System.out.println("Os divisores de " + numero + " são:");
       do { if (numero % i == 0) { System.out.println(i);}
           i++; } while (i <= numero); } }
