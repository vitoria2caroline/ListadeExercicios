package exercicios;

public class exc45 {
     public static void main(String[] args) {
         int contador = 0; int a = 0; int b = 1;
         while (contador < 20) { System.out.print(a + " ");
             int proximo = a + b; a = b; b = proximo; contador++; } } }
