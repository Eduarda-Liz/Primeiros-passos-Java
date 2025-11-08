/*É um dia muito quente na cidade onde Carlinhos mora e ele está com muita vontade de comer sorvete. 
Seu amigo lhe disse que tem sorvete em casa, mas só vai ganhar se ele passar por um desafio. O desafio consiste em 
informar o quadrado dos números até que seja dito um número múltiplo de 6 (também deve ser dito o quadrado deste último número, porém mais nenhum após esse).

Entrada

Números inteiros N (0<N<1000) até que seja informado um número múltiplo de 6.

Saída

Informar o quadrado dos números ditos (inclusive o último número que é múltiplo de 6).*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int numero = keyboard.nextInt();

        System.out.println((int)Math.pow(numero, 2));

        while (numero%6!=0) {
            numero = keyboard.nextInt();
            System.out.println((int)Math.pow(numero, 2));
        }
        
    keyboard.close();
    }
}
