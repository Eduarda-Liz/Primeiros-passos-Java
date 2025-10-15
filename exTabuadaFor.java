/*Peça ao usuário um número inteiro e exiba a tabuada desse número de 1 a 10.*/

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int num = keyboard.nextInt();
    
    for (int cont = 1; cont<=10; cont++) {
        System.out.println(num + " x " + cont + " = " + (num*cont) );
    }

       keyboard.close();

    }
}
