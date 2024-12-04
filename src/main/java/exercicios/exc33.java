package exercicios;
import java.util.Scanner;
public class exc33 {
   /* 33) Crie um programa que leia o nome e o turno (M ou V) de um aluno e exiba uma mensagem de saudação de acordo com o turno. Matutino: "Bom dia, aluno", Vespertino: "Boa tarde, aluno". */
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite o nome do aluno: ");
       String nome = entrada.nextLine();
       System.out.print("Digite o turno (M para Matutino, V para Vespertino): ");
       char turno = entrada.next().charAt(0);
       if (turno == 'M' || turno == 'm') {
           System.out.println("Bom dia, " + nome + ".");
       } else if (turno == 'V' || turno == 'v') {
           System.out.println("Boa tarde, " + nome + ".");
       } else { System.out.println("Turno inválido.");
       }
   }
   }

