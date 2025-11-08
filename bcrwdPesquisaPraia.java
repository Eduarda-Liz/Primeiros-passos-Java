/*Cláudia está realizando uma pesquisa social envolvendo a faixa de idade que frequenta a praia. Seu estudo quer, principalmente,
identificar a diferença de quantidade de pessoas com menos de 21 anos (idade<21) e de pessoas com mais de 50 anos (idade>50). 
Faça um algoritmo que ajude Cláudia na pesquisa.

Entrada

Um número inteiro N (N>0) que será o número de pessoas, a seguir N inteiros X (0<=X<=100) que representam a idade das pessoas na praia

Saída

O número de pessoas com menos de 21 anos (idade<21) e o número de pessoas com mais de 50 anos (idade>50), respectivamente.*/
import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pessoas = keyboard.nextInt();
    int cont21 = 0;
    int cont50 = 0;
    int idade;
        for (int i=0; i<pessoas; i++) {
            idade = keyboard.nextInt();
            if (idade<21) {
                cont21++;
            } 
            if (idade>50) {
                cont50++;
            }
        }

        System.out.println(cont21);
        System.out.println(cont50);
    keyboard.close();
    }
}
