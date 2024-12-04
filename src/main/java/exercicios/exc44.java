package exercicios;
import java.util.Scanner;
public class exc44 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String nome; int idade; int somaIdades = 0;
       int contador = 0;
       while (contador < 5)
       { System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
           nome = scanner.nextLine();
           System.out.print("Digite a idade de " + nome + ": ");
           idade = scanner.nextInt();
           scanner.nextLine();
           somaIdades += idade; contador++; }
       double media = (double) somaIdades / 5; System.out.println("A média das idades é: ");
}}
