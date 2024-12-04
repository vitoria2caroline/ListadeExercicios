package exercicios;
import java.util.Scanner;
public class exc65 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nome; int idade, somaIdades = 0, contador = 0;
    do { System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
        nome = scanner.next();
        if (nome.equalsIgnoreCase("fim"))
        { break; } System.out.print("Digite a idade de " + nome + ": ");
        idade = scanner.nextInt();
        somaIdades += idade; contador++;
    } while (true);
    if (contador > 0) { double media = (double) somaIdades / contador;
        System.out.println("A média das idades é: " + media);
    } else { System.out.println("Nenhuma idade foi informada.");
    } scanner.close(); } }