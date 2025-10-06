/*Os alunos da Turma B do quarto ano estão indo muito mal em matemática e a professora Letícia está quebrando a cabeça para achar um jeito de reverter isso.

Pensando em trazer algo desafiador, mas ao mesmo tempo divertido para as crianças, Letícia pensou em fazer uma gincana matemática, cheia de perguntas e atividades.

A segunda tarefa será a seguinte: A professora irá falar dois números e os alunos deverão efetuar a adição deles; Se o resultado for maior que 20, 
os alunos deverão correr até o quadro e escrever o resultado mais a soma do valor 8, senão devem escrever o resultado subtraindo o valor 5.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int vlr1 = keyboard.nextInt();
    int vlr2 = keyboard.nextInt();
    
    if (vlr1+vlr2>20) {
       System.out.println(vlr1+vlr2+8);
    } else {
      System.out.println(vlr1+vlr2-5);
    }
    
    keyboard.close();
  }
}
