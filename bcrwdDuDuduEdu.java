/*Du, Dudu e Edu decidiram fazer um campeonato de ping pong, alternando quem joga com quem. 
Ao final, quem fizer mais pontos ganha um bolo de chocolate com cobertura de brigadeiro e quem perder, terá que pagar uma prenda.

Faça um programa que informe quem ganhará o bolo e quem pagará a prenda.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int du = keyboard.nextInt();
    int dudu = keyboard.nextInt();
    int edu = keyboard.nextInt();
    
    if (du>dudu && du>edu) {
      System.out.println("DU WON");
    }
       if (dudu>du && dudu>edu) {
      System.out.println("DUDU WON");
    }
    if (edu>du && edu>dudu) {
      System.out.println("EDU WON");
    }
     if (edu<du && edu<dudu) {
      System.out.println("EDU LOST");
    }
     if (du<dudu && du<edu) {
      System.out.println("DU LOST");
    }
    if (dudu<du && dudu<edu) {
      System.out.println("DUDU LOST");
    }
    
    
   keyboard.close();
  }
}
