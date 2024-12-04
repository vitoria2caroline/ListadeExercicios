package exercicios;
import java.util.Scanner;
public class exc34 {
   /* 34) Faça um programa que leia a idade de uma pessoa e exiba se ela pode ou não votar. O voto é obrigatório para pessoas entre 18 e 70 anos, e facultativo para pessoas entre 16 e 18 anos e com mais de 70 anos. */
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Digite a idade: ");
      int idade = entrada.nextInt();
      if (idade >= 18 && idade <= 70) {
          System.out.println("O voto é obrigatório.");
      } else if ((idade >= 16 && idade < 18) || idade > 70)
      { System.out.println("O voto é opcional.");
      } else { System.out.println("Não pode votar.");
      }
  }
}

