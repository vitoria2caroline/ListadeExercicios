package exercicios;
import java.util.Scanner;
public class exc74 {
     public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); String[] nomes = new String[5];
      int[] idades = new int[5];
      int somaIdades = 0;
      int contador = 0;
      while (contador < 5)
      { System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
          nomes[contador] = scanner.nextLine();
          System.out.print("Digite a idade de " + nomes[contador] + ": ");
          idades[contador] = scanner.nextInt(); scanner.nextLine();
          somaIdades += idades[contador]; contador++;
      } double mediaIdades = somaIdades / 5.0;
      System.out.println("A média das idades é: " + mediaIdades); } }
