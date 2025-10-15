/*Solicite ao usuário um número inteiro positivo e calcule o fatorial desse número usando uma estrutura de repetição.
Exemplo: se o usuário digitar 5, o resultado será 120*/

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int fat = keyboard.nextInt();
    int res = 1;

    for (int cont=1; cont<=fat; cont++) {
       res = cont * res;
    }
    System.out.println(res);
    keyboard.close();

    }
}
