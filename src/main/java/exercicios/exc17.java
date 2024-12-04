package exercicios;

import java.util.Scanner;

public class exc17 {
/*17) Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem indicando se ela é criança, adolescente, adulto ou idoso.*/
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            int idade;

            System.out.print(" entre com a sua idade: ");
            idade = entrada.nextInt();


            if (idade <=12)  {
                System.out.println("você é uma criança");
            } else if (idade >= 12 && idade <= 18) {
                System.out.println("Adolecente");
            } else if (idade >=19 && idade <=59) {
                System.out.println("você é adulto ");
            } else if (idade >=60 && idade <= 100) {
                System.out.println("você é idoso");
            } else {
                System.out.println("TÙ DEVIA ESTAR MORTO(A)");
            }
        }
    }

