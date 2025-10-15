/*Solicite ao usuário um número inteiro positivo e calcule o fatorial desse número usando uma estrutura de repetição.
Exemplo: se o usuário digitar 5, o resultado será 120*/

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    int f1 = 0;
    int f2 = 1;

    for (int cont=0; cont<=n; cont++){
        System.out.print(f1 + " ");
        int proximo = f1 + f2;
        f1 = f2;
        f2 = proximo;
    }


    keyboard.close();

    }
}
