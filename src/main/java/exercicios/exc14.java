package exercicios;
import java.util.Scanner;
public class exc14 {

    /* 14) Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias de vida ela tem. */

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            // Recebendo a idade em anos, meses e dias
            System.out.print("Digite a idade em anos: ");
            int anos = entrada.nextInt();

            System.out.print("Digite a idade em meses: ");
            int meses = entrada.nextInt();

            System.out.print("Digite a idade em dias: ");
            int dias = entrada.nextInt();

            // Calculando o total de dias de vida
            int totalDias = (anos * 365) + (meses * 30) + dias;

            // Exibindo o total de dias de vida
            System.out.println("Total de dias de vida: " + totalDias);

        }
    }


