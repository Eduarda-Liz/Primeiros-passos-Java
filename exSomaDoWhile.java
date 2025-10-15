/*Faça um programa que leia vários números inteiros digitados pelo usuário e só pare quando o valor 0 for digitado.
No final, mostre a soma de todos os números digitados (sem contar o zero).*/
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int cont = 0;
    int soma = 0;
    do {
         cont = keyboard.nextInt();
         if (cont!=0) {
            soma = cont + soma;
         }
    } while (cont!=0);

        System.out.println(soma);
    keyboard.close();

    }
}
