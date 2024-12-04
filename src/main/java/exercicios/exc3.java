package exercicios;
import java.util.Scanner;
/* 3) Crie um programa que leia a base e a altura de um triângulo e calcule sua área. */
 public class exc3 { public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o valor da base do triângulo: ");
    double base = entrada.nextFloat();
    System.out.print("Digite o valor da altura do triângulo: ");
    double altura = entrada.nextFloat();
    double area = (base * altura) / 2;
    System.out.println("A área do triângulo é: " + area + " unidades quadradas");
}}