package exercicios;
import java.util.Scanner;
/* 23) Escreva um programa que leia o nome de um mês e exiba a quantidade de dias que ele possui. Considere apenas meses válidos. */
public class exc23 { public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o nome do mês: ");
    String mes = entrada.next().toLowerCase();

    int dias;
    switch (mes) { case "janeiro":
        case "março": case "maio": case "julho":
            case "agosto": case "outubro": case "dezembro":
                dias = 31; break; case "abril": case "junho":
                    case "setembro": case "novembro": dias = 30;
                    break; case "fevereiro": dias = 28;
                  break; default: dias = -1;
                  break; }
    if (dias != -1)
    { System.out.println("O mês de " + mes + " tem " + dias + " dias.");
    } else { System.out.println("Mês inválido. Por favor, digite um mês válido.");
    }
}
}