/*Carlos está colhendo as batatas para sua mãe e gostaria de saber quantas batatas já teriam sido colhidas se seus dois irmãos estivessem ajudando. 
Faça um algoritmo que calcule isso, lembrando que todos eles conseguem colher exatamente a mesma quantidade de batatas.

Entrada

Um número inteiro N que será a quantidade de batatas que Carlos colheu sozinho.

OBS: O programa acaba quando o valor de N for -999.

Saída

A quantidade de batatas que teriam sido colhidas caso seus outros dois irmãos ajudassem.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int valor = keyboard.nextInt();
        while (valor != -999) {
            System.out.println(valor*3);
            valor = keyboard.nextInt();
        }
        
        keyboard.close();
    }
}
