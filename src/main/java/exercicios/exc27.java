package exercicios;
import java.util.Scanner;
public class exc27 {
     /* 27) Crie um programa que leia a idade de uma pessoa e seu sexo (M ou F) e exiba uma mensagem indicando se ela pode ou não se aposentar. Homens podem se aposentar com 65 anos ou mais, e mulheres com 60 anos ou mais. */
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
          System.out.print("Digite a idade: ");
          int idade = entrada.nextInt();
          System.out.print("Digite o sexo (M para masculino, F para feminino): ");
          char sexo = entrada.next().charAt(0);
          if ((sexo == 'M' || sexo == 'm') && idade >= 65) {
              System.out.println("Pode se aposentar.");}
          else if ((sexo == 'F' || sexo == 'f') && idade >= 60)
          { System.out.println("Pode se aposentar.");}
          else { System.out.println("Não pode se aposentar.");
          }
     }
}
