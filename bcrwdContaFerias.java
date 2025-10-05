/*Lucas vai passar três meses fora do país e está curioso em como isso vai afetar sua conta bancária.

Crie um algoritmo que diga a Lucas quantos meses ele gastou mais do que tinha.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double vlr1 = keyboard.nextDouble();
    double vlr2 = keyboard.nextDouble();
    double vlr3 = keyboard.nextDouble();
    int negativo = 0;
    if (vlr1<0) {
      negativo = negativo + 1;
    }
    if (vlr2<0) {
      negativo = negativo + 1;
    }
    if (vlr3<0) {
      negativo = negativo + 1;
    }
    
    System.out.println(negativo);
    
    keyboard.close();
  }
}
