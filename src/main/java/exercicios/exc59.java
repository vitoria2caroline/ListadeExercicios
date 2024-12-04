package exercicios;
import java.util.Scanner;
public class exc59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0; int contador = 0;
        do { System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.next();
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade; contador++;
        } while (contador < 5);
        double media = (double) somaIdades / contador;
        System.out.println("A média das idades é: " + media);
        scanner.close();
    }
}
