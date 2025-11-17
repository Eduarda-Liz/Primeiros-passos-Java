/*A professora está ensinando seus alunos a contar até 100 em espanhol e, pensando em ajudá-los a aprender de uma maneira mais divertida, ela decidiu fazer um pequeno desafio. Cada aluno terá apresentado em seu computador os números de 1 a 100 e eles terão que escrevê-los em espanhol em apenas 5 minutos.

Crie um programa que ajude a professora a apresentar os 100 números de uma maneira mais rápida e prática na tela.

Saída

Mostre na tela os números inteiros de 1 a 100.*/

import java.util.*;


class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int contador = 1;
        
        for (int i=0; i<100; i++){
           System.out.println(contador);
           contador++;
        }
 
        
        keyboard.close();
    }
}
