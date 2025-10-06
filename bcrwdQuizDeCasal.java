/*Dona Jo está planejando um quiz de casal para o encontro duplo que ela vai fazer com sua amiga. 
Ela criou várias perguntas e atividades divertidas para eles fazerem, mas há um problema, eles não tem quem mediar a competição. 
Ela precisa de alguém que some os pontos finais das duplas e mostre o resultado.

Pensando nisso, faça um programa que receba os pontos de cada participante e some os de cada dupla 
(sendo os dois primeiros valores correspondentes à primeira dupla, e os outros dois, à segunda dupla).*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pontuacao1 = keyboard.nextInt();
    int pontuacao2 = keyboard.nextInt();
    int pontuacao3 = keyboard.nextInt();
    int pontuacao4 = keyboard.nextInt();
    int casal1 = pontuacao1 + pontuacao2;
    int casal2 = pontuacao3 + pontuacao4;
    
    if (casal1-casal2==0){
      System.out.println(pontuacao1 +" + " + pontuacao2 + " = " + casal1);
      System.out.println(pontuacao3 +" + " + pontuacao4 + " = " + casal2);
    } else {
      System.out.println(casal1);
      System.out.println(casal2);
    }
    
    
    
    keyboard.close();
  }
}
