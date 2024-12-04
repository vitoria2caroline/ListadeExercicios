package exercicios;
import java.util.Scanner;
public class exc29 {
   /* 29) Escreva um programa que leia o nome e a nota de um aluno e exiba sua situação na disciplina. Se a nota for maior ou igual a 7, o aluno está aprovado. Caso contrário, está em recuperação. */
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Digite o nome do aluno: ");
       String nome = entrada.nextLine();
       System.out.print("Digite a nota do aluno: ");
       double nota = entrada.nextDouble();
       String situacao; if (nota >= 7) { situacao = "aprovado";
       } else { situacao = "em recuperação";
       } System.out.println("O aluno " + nome + " está " + situacao + ".");
   }
}
