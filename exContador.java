/*Escreva um programa que peça ao usuário um número inteiro n 
e exiba na tela todos os números de 1 até n, um por linha.*/
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    int cont = 1;

    while (cont<=n) {
        System.out.println(cont);
        cont++;
    }
    keyboard.close();
    }
}
