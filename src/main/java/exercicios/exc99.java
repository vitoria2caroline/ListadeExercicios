package exercicios;
import java.util.Scanner;
public class exc99 {
   public static void main(String[] args) {

       Scanner entrada = new Scanner(System.in);

       int[][] matriz1 = new int[2][2]; int[][] matriz2 = new int[2][2];

       int[][] somaMatriz = new int[2][2];

       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
               matriz1[i][j] = entrada.nextInt();} }
       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
               matriz2[i][j] = entrada.nextInt();} }
       for (int i = 0; i < 2; i++){
           for (int j = 0; j < 2; j++){
               somaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];} }
       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
               System.out.print(somaMatriz[i][j] + " ");}
           System.out.println(); }
       entrada.close(); } }
}
