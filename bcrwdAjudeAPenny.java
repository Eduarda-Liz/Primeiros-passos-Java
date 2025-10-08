/*Penny começou a estudar mais para poder manter uma conversa com Leonard por mais de 5 minutos. Neste momento ela está estudando matemática 
e gostaria de ajuda para conferir se suas respostas estão certas. Ela tem uma lista de números e precisa informar se eles são divisíveis por 3 e por 7.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int numero = keyboard.nextInt();
    
    if (numero%3==0 && numero%7==0) {
      System.out.println("YES");
    } else {
       System.out.println("NO");
    }
    
    keyboard.close();
  }
}
