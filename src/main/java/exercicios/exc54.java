package exercicios;
import java.util.Scanner;
public class exc54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int contador = 0;
        do { System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            total += numero; contador++;
        } while (contador < 5);
        double media = (double) total / contador;
        System.out.println("A média aritmética dos valores lidos é: " + media); } }

